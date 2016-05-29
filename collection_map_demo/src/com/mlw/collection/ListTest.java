package com.mlw.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/**
 * 备选课程类
 * @author Administrator
 *
 */
public class ListTest {
	/**
	 * 用于存放备选课程的List
	 */
	public List courseToSelect;
	
	public ListTest(){//构造方法
		this.courseToSelect=new ArrayList();
		//将List接口实例化
	}
	/**
	 * 用于往courseToSelect中添加备选课程
	 */
	public void testAdd(){
		/**
		 * 创建一个Course对象，并通过调用add方法，添加到备选课程List中
		 */
		Course cr1= new Course("1","数值分析");
		courseToSelect.add(cr1);
		Course temp= (Course) courseToSelect.get(0);
		//当一个对象被添加到List中时会忽略他原有的类型，因此需要添加（Course进行类型强制转换）
		System.out.println("添加了课程"+temp.id+":"+temp.name);
		Course cr2= new Course("2","数据结构");
		courseToSelect.add(0, cr2);//定位插入数据
		Course temp2= (Course) courseToSelect.get(0);
		System.out.println("添加了课程"+temp2.id+":"+temp2.name);
		
		Course[] course={new Course("3","离散数学"),new Course("4","机器学习")};
		courseToSelect.addAll(Arrays.asList(course));
		Course temp3=(Course) courseToSelect.get(2);
		Course temp4=(Course) courseToSelect.get(3);
		
		System.out.println("添加了两门课程"+temp3.id+":"+temp3.name+";"
				+temp4.id+":"+temp4.name);
		
		Course[] course2={new Course("5","凸优化设计"),new Course("6","算法")};
		courseToSelect.addAll(2, Arrays.asList(course2));//插入数据并且不是覆盖，后面的数据自动后移
		Course temp5= (Course) courseToSelect.get(4);
		Course temp6= (Course) courseToSelect.get(5);
		System.out.println("又添加了两门课程"+temp5.id+":"+temp5.name+";"
				+temp6.id+":"+temp6.name);
	}
	
	/**
	 * 取得List中的元素方法
	 * @param args
	 */
	public void testGet(){
		int size =courseToSelect.size();
		System.out.println("有如下课程输出：");
		for(int i=0;i<size;i++){
			Course cr=(Course) courseToSelect.get(i);
			System.out.println(cr.id+":"+cr.name);
		}
		
	}
	
	/**
	 * 通过迭代器遍历集合中的数据
	 * @param args
	 */
	
	public void testIterator(){
		//通过集合的Iterator方法，取得迭代器的实例
		//迭代器只是为了取出集合中的元素的，他本身不具有任何存储功能他是依赖于某个集合存在的，而不能独立存在
		Iterator it =courseToSelect.iterator();
		System.out.println("有如下课程输出(通过迭代器实现)：");
		while(it.hasNext()){
		Course cr= (Course) it.next();	
		System.out.println(cr.id+":"+cr.name);
		}
	}
	
	/**
	 * 通过for each 方法访问集合元素
	 * @param args
	 */
	public void testForEach(){
		System.out.println("有如下课程输出(通过for each)：");
		for(Object obj: courseToSelect){//元素从集合中取出来是默认为object类的
			Course cr =(Course) obj;
			System.out.println(cr.id+":"+cr.name);
		}
		
	}
	
	/**
	 * 修改List中的元素
	 * @param args
	 */
	public void testModify(){
		Course cr5=new Course("7","营销学原理");
		courseToSelect.set(2,cr5);
		//通过调用List集合中的set 方法实现修改元素
		
	} 
	
	/**
	 * 删除List中的元素
	 * @param args
	 */
	public void testRemove(){
		Course cr= (Course) courseToSelect.get(2);
		System.out.println("我是课程："+cr.id+":"+cr.name);
		courseToSelect.remove(2);
		testForEach();
	}
//	public static void main(String[] args){
//		ListTest lt=new ListTest();
//		lt.testAdd();
//		lt.testGet();
//		lt.testIterator();
//		lt.testForEach();
//		lt.testModify();
//		lt.testForEach();
//		lt.testRemove();
//	}
}
