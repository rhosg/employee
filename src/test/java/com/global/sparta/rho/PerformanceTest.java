package com.global.sparta.rho;

import com.global.sparta.rho.display.DAO;
import com.global.sparta.rho.employees.FileReader;
import org.junit.Before;

import org.junit.Test;


import java.text.DecimalFormat;


public class PerformanceTest {



        FileReader fileReader =new FileReader();

        @Before
        public void setup() {
            fileReader.readFile();
        }

        @Test
        public void testSQlInsert(){
            DAO dao =new DAO();
            long start = System.nanoTime();
            dao.addToDatabase(fileReader.returnArray());
            long end = System.nanoTime();
            printResults(end-start);
        }

        private void printResults(long duration) {
            DecimalFormat decimalFormat = new DecimalFormat("###,###.####");
            System.out.println("Time taken "+ (decimalFormat.format(duration)) + " nano seconds");
        }
    }


