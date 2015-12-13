package com.staff.efficiency.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.util.List;

public class BaseRepository {
    protected JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    protected <T> T querySingleObjectOrNull(final String sql, PreparedStatementSetter pss, RowMapper<T> rowMapper) {
        List<T> result = jdbcTemplate.query(sql, pss, rowMapper);
        return result.isEmpty() ? null : result.get(0);
    }
}
