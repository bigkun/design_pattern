package com.outlook.bigkun.beanutils;

import cn.hutool.core.util.ObjectUtil;
import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import net.sf.cglib.beans.BeanCopier;
import org.apache.commons.beanutils.BeanUtilsBean2;
import org.springframework.beans.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * @author zhanghk
 * @since 2019/7/22
 */
public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Person person = new Person();
        Person.Address address = new Person.Address();
        address.setAddress("Weihai");
        address.setNumber(100000);
        person.setName("bigkun");
        person.setAddress(address);

        // 1. Spring BeanUtils
        Person person1 = new Person();
        BeanUtils.copyProperties(person, person1);
        print(person, person1, "Spring BeanUtils");

        // 2. Apache Commons BeanUtils
        Person person2 = (Person) org.apache.commons.beanutils.BeanUtils.cloneBean(person);
        print(person, person2, "Apache Commons BeanUtils");

        // 3. Apache Commons BeanUtilsBean2
        Person person3 = (Person) BeanUtilsBean2.getInstance().cloneBean(person);
        print(person, person3, "Apache Commons BeanUtilsBean2");

        // 4. Cglib BeanCopier
        BeanCopier beanCopier = BeanCopier.create(Person.class, Person.class, false);
        Person person4 = new Person();
        beanCopier.copy(person, person4, null);
        print(person, person4, "Cglib BeanCopier");

        // 5. Dozer
        Mapper mapper = DozerBeanMapperBuilder.buildDefault();
        Person person5 = mapper.map(person, Person.class, "");
        print(person, person5, "Dozer");

        // 6. Orika
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        MapperFacade mapperFacade = mapperFactory.getMapperFacade();
        Person person6 = mapperFacade.map(person, Person.class);
        print(person, person6, "Orika");

        // 7. hutool clone by stream
        Person person7 = ObjectUtil.cloneByStream(person);
        print(person, person7, "hutool clone by stream");
        // BeanUtilsBean2.getInstance().copyProperties();

    }

    private static void print(Person origin, Person clone, String tag) {
        System.out.println("::= " + tag + " =::");
        System.out.println("person objects are not same object: " + (origin != clone) + ", address objects are not same object: " + (origin.getAddress() != clone.getAddress()));
        System.out.println("");

    }
}
