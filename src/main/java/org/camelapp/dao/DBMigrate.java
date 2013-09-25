package org.camelapp.dao;

import com.googlecode.flyway.core.Flyway;

import javax.sql.DataSource;

public class DBMigrate {
    private DataSource dataSource;

    public DBMigrate(DataSource dataSource) {
        this.dataSource = dataSource;
        migrate();
    }

    private void migrate() {
        Flyway flyway = new Flyway();
        flyway.setDataSource(dataSource);
        flyway.init();
        flyway.migrate();
    }
}
