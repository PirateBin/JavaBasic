package proOOP.Interface.project;

import java.util.Random;

public class NameAndAgeUtil {
        private NameAndAgeUtil(){}

        public static String name() {
            String[] name = {"夏侯云飞", "张三", "濯沛儿", "夙尔丝", "缪孟夏", "谭千风", "郎孟君", "似悦心", "荆阳文", "宓念雁", "司马晗"};



            Random rand = new Random();


            return name[rand.nextInt(name.length)];
        }

        public static int age(){
            int[] age = {18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};

            Random rand=new Random();

            return age[rand.nextInt(age.length)];

        }

    }

