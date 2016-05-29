package com.mlw.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
/**
 * 带有泛型——Course 的List类型
 * @param args
 */
	public List<Course> course;
	public TestGeneric(){
		this.course=new ArrayList<Course>();//圆括号表示调用了构造方法
	}
	/**
	 * 测试添加
	 * @param args
	 */
	public void testAdd(){
		Course cr1=new Course("1","毛概");
		course.add(cr1);
		//泛型集合中不能添加泛型规定的类型以外的对象，否则会报错
//		course.add("字符串");
		Course cr2=new Course("2","java");
		course.add(cr2);
	}
	/**
	 *遍历输出
	 * @param args
	 */
	public void testForEach(){
		for(Course cr:course){
			System.out.println("课程："+cr.id+":"+cr.name);
		}
	}
//	public static void main(String[] args){
//		TestGeneric tg =new TestGeneric();
//		tg.testAdd();
//		tg.testForEach();
//	}
}
