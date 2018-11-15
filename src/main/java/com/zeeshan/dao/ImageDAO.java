package com.zeeshan.dao;

import java.io.IOException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

@Repository
public class ImageDAO {

	private JdbcTemplate jt;

	public ImageDAO(DataSource dataSource) {
		jt = new JdbcTemplate(dataSource);
	}

	public int insertRecords(String name, Integer age, MultipartFile photo) throws IOException {

		byte[] photoBytes = photo.getBytes();
		String sql = "INSERT INTO STUDENT(NAME, AGE, PHOTO) VALUES(?, ?, ?)";
		return jt.update(sql, new Object[] { name, age, photoBytes });

	}
}
