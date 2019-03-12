package com.example.clustering;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * http://data-mining.philippe-fournier-viger.com/introduction-clustering-k-means-java-code/b5-2/
 * http://www.philippe-fournier-viger.com/spmf/index.php?link=download.php
 */
@SpringBootApplication
public class ClusteringApplication {

    public static void main(String[] args) {
        System.out.println("Hola");

        SpringApplication.run(ClusteringApplication.class, args);
    }

}
