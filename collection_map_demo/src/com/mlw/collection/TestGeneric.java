package com.mlw.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
/**
 * ���з��͡���Course ��List����
 * @param args
 */
	public List<Course> course;
	public TestGeneric(){
		this.course=new ArrayList<Course>();//Բ���ű�ʾ�����˹��췽��
	}
	/**
	 * �������
	 * @param args
	 */
	public void testAdd(){
		Course cr1=new Course("1","ë��");
		course.add(cr1);
		//���ͼ����в�����ӷ��͹涨����������Ķ��󣬷���ᱨ��
//		course.add("�ַ���");
		Course cr2=new Course("2","java");
		course.add(cr2);
	}
	/**
	 *�������
	 * @param args
	 */
	public void testForEach(){
		for(Course cr:course){
			System.out.println("�γ̣�"+cr.id+":"+cr.name);
		}
	}
//	public static void main(String[] args){
//		TestGeneric tg =new TestGeneric();
//		tg.testAdd();
//		tg.testForEach();
//	}
}
