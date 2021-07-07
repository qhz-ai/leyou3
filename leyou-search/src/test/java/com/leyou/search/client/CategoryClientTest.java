package com.leyou.search.client;

import com.leyou.search.LeyouSearchApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = LeyouSearchApplication.class)
public class CategoryClientTest {
    @Autowired
    private CategoryClient categoryClient;

    @Test
    public void testQueryCategories() {
        ResponseEntity<List<String>> names = this.categoryClient.queryNameByIds(Arrays.asList(1L, 2L, 3L));
        List<String> list = names.getBody();
        list.forEach(System.out::println);
    }
}