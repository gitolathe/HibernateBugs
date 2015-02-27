package org.myola.demo.jpa.config;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.vendor.AbstractJpaVendorAdapter;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;

/**
 *
 * @author Ola Theander <ola.theander@nasdaq.com>
 */
@Configuration
@ConditionalOnClass(
        name = "org.eclipse.persistence.jpa.PersistenceProvider")
public class EclipseLinkConfiguration extends JpaBaseConfiguration {

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(EclipseLinkConfiguration.class);

    @Override
    protected AbstractJpaVendorAdapter createJpaVendorAdapter() {
        LOG.info("Creating EclipseLinkJpaVendorAdapter bean.");
        EclipseLinkJpaVendorAdapter adapter = new EclipseLinkJpaVendorAdapter();
        return adapter;
    }

    @Override
    protected Map<String, Object> getVendorProperties() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("eclipselink.weaving", "false");
        map.put("eclipselink.logging.level", "finest");
        return map;
    }

}
