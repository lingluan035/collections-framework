package com.mlw.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/**
 * ��ѡ�γ���
 * @author Administrator
 *
 */
public class ListTest {
	/**
	 * ���ڴ�ű�ѡ�γ̵�List
	 */
	public List courseToSelect;
	
	public ListTest(){//���췽��
		this.courseToSelect=new ArrayList();
		//��List�ӿ�ʵ����
	}
	/**
	 * ������courseToSelect����ӱ�ѡ�γ�
	 */
	public void testAdd(){
		/**
		 * ����һ��Course���󣬲�ͨ������add��������ӵ���ѡ�γ�List��
		 */
		Course cr1= new Course("1","��ֵ����");
		courseToSelect.add(cr1);
		Course temp= (Course) courseToSelect.get(0);
		//��һ��������ӵ�List��ʱ�������ԭ�е����ͣ������Ҫ��ӣ�Course��������ǿ��ת����
		System.out.println("����˿γ�"+temp.id+":"+temp.name);
		Course cr2= new Course("2","���ݽṹ");
		courseToSelect.add(0, cr2);//��λ��������
		Course temp2= (Course) courseToSelect.get(0);
		System.out.println("����˿γ�"+temp2.id+":"+temp2.name);
		
		Course[] course={new Course("3","��ɢ��ѧ"),new Course("4","����ѧϰ")};
		courseToSelect.addAll(Arrays.asList(course));
		Course temp3=(Course) courseToSelect.get(2);
		Course temp4=(Course) courseToSelect.get(3);
		
		System.out.println("��������ſγ�"+temp3.id+":"+temp3.name+";"
				+temp4.id+":"+temp4.name);
		
		Course[] course2={new Course("5","͹�Ż����"),new Course("6","�㷨")};
		courseToSelect.addAll(2, Arrays.asList(course2));//�������ݲ��Ҳ��Ǹ��ǣ�����������Զ�����
		Course temp5= (Course) courseToSelect.get(4);
		Course temp6= (Course) courseToSelect.get(5);
		System.out.println("����������ſγ�"+temp5.id+":"+temp5.name+";"
				+temp6.id+":"+temp6.name);
	}
	
	/**
	 * ȡ��List�е�Ԫ�ط���
	 * @param args
	 */
	public void testGet(){
		int size =courseToSelect.size();
		System.out.println("�����¿γ������");
		for(int i=0;i<size;i++){
			Course cr=(Course) courseToSelect.get(i);
			System.out.println(cr.id+":"+cr.name);
		}
		
	}
	
	/**
	 * ͨ�����������������е�����
	 * @param args
	 */
	
	public void testIterator(){
		//ͨ�����ϵ�Iterator������ȡ�õ�������ʵ��
		//������ֻ��Ϊ��ȡ�������е�Ԫ�صģ������������κδ洢��������������ĳ�����ϴ��ڵģ������ܶ�������
		Iterator it =courseToSelect.iterator();
		System.out.println("�����¿γ����(ͨ��������ʵ��)��");
		while(it.hasNext()){
		Course cr= (Course) it.next();	
		System.out.println(cr.id+":"+cr.name);
		}
	}
	
	/**
	 * ͨ��for each �������ʼ���Ԫ��
	 * @param args
	 */
	public void testForEach(){
		System.out.println("�����¿γ����(ͨ��for each)��");
		for(Object obj: courseToSelect){//Ԫ�شӼ�����ȡ������Ĭ��Ϊobject���
			Course cr =(Course) obj;
			System.out.println(cr.id+":"+cr.name);
		}
		
	}
	
	/**
	 * �޸�List�е�Ԫ��
	 * @param args
	 */
	public void testModify(){
		Course cr5=new Course("7","Ӫ��ѧԭ��");
		courseToSelect.set(2,cr5);
		//ͨ������List�����е�set ����ʵ���޸�Ԫ��
		
	} 
	
	/**
	 * ɾ��List�е�Ԫ��
	 * @param args
	 */
	public void testRemove(){
		Course cr= (Course) courseToSelect.get(2);
		System.out.println("���ǿγ̣�"+cr.id+":"+cr.name);
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
