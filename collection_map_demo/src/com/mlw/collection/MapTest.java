package com.mlw.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
/**
 * 用来承装学生类型对象
 * @param args
 */
	public Map<String,Student> students;
	/**
	 * 在构造器中初始化学生属性
	 * @param args
	 */
	public MapTest(){
		this.students=new HashMap<String,Student>();
	}
	/**
	 * 测试添加：输入学生ID，判断是否被占用
	 * 如果未被占用，则输入姓名，创建学生对象
	 * 并且添加到students中
	 * @param args
	 */
	public void testPut(){
		Scanner console =new Scanner(System.in);
		int i=0;
		while(i<3){
			System.out.println("请输入学生ID:");
			String ID =console.next();
			//判断该ID是否被占用
			Student st=students.get(ID);
			if(st==null)//未被占用，返回null 
			{
				System.out.println("请输入学生姓名：");
				String name= console.next();
				//创建新的学生对象
				Student newStudent=new Student(ID,name);
				//通过调用Map中的put方法将ID-学生映射添加到students 中
				students.put(ID, newStudent);
				System.out.println("成功添加学生："+students.get(ID).name);
				i++;
			}else{
				System.out.println("ID已被占用，请重新输入");
				continue;
			}
		}
	}
	/**
	 * 测试Map的keySet 方法
	 * @param args
	 */
	public void testKeySet(){
		Set<String> keySet =students.keySet();
		System.out.println("共有"+students.size()+"个学生");
		for(String stdId:keySet){
			Student st=students.get(stdId);
			if(st!=null){
				System.out.println("学生："+st.name);
			}
		}
	}
	/**
	 * 测试删除Map中的映射
	 * @param args
	 */
	public void testRemove(){
		Scanner console =new Scanner(System.in);
		while(true){
			System.out.println("请输入要删除的学生的ID：");
			String ID=console.next();
			Student st=students.get(ID);
			if(st==null){
				System.out.println("该ID对应的学生不存在！");
				continue;
			}
			students.remove(ID);
			System.out.println("学生"+st.name+"已成功被删除！");
			break;
		}	
	}
	/**
	 * 测试EntrySet方法
	 * @param args
	 */
	public void testEntrySet(){
		
		Set<Entry<String,Student>> entrySet= students.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			System.out.println("key:"+entry.getKey());
			System.out.println("value:"+entry.getValue().name);
		}
	}
	/**
	 * 利用put方法，修改Map中已有的映射
	 * @param args
	 */
	public void testModify(){
		System.out.println("请输入要修改的学生ID：");
		Scanner console = new Scanner(System.in);
		while(true){
			String stId=console.next();
			Student st=students.get(stId);
			//判断ID对应的信息是否存在
			if(st==null){
				System.out.println("该ID对应的信息不存在，请重新输入！");
				continue;
			}
			//提示当前学生ID对应的学生姓名
			System.out.println("该ID对应的学生姓名为"+st.name);
			//修改信息
			System.out.println("请输入新的学生姓名：");
			String newName=console.next();
			Student newStudent=new Student(stId,newName);
			students.put(stId,newStudent);
			System.out.println("修改成功！");
			break;
		}
		
	}
	
	public static void main(String[] args) {
		MapTest mt= new MapTest();
		mt.testPut();
		mt.testKeySet();
//		mt.testRemove();
//		mt.testEntrySet();
		mt.testModify();
		mt.testKeySet();
	}

}
