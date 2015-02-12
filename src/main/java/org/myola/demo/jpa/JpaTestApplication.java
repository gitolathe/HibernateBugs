package org.myola.demo.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//public class JpaTestApplication extends JpaBaseConfiguration {
public class JpaTestApplication  {

    public static void main(String[] args) {
        SpringApplication.run(JpaTestApplication.class, args);
    }

//    @Override
//    protected AbstractJpaVendorAdapter createJpaVendorAdapter() {
//        EclipseLinkJpaVendorAdapter adapter = new EclipseLinkJpaVendorAdapter();
//        return adapter;
//    }
//
//    @Override
//    protected Map<String, Object> getVendorProperties() {
//        HashMap<String, Object> map = new HashMap<String, Object>();
//        map.put("eclipselink.weaving", "false");
//        map.put("eclipselink.logging.level", "fine");
//        return map;
//    }

}
