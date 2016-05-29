package com.mlw.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
/**
 * ������װѧ�����Ͷ���
 * @param args
 */
	public Map<String,Student> students;
	/**
	 * �ڹ������г�ʼ��ѧ������
	 * @param args
	 */
	public MapTest(){
		this.students=new HashMap<String,Student>();
	}
	/**
	 * ������ӣ�����ѧ��ID���ж��Ƿ�ռ��
	 * ���δ��ռ�ã�����������������ѧ������
	 * ������ӵ�students��
	 * @param args
	 */
	public void testPut(){
		Scanner console =new Scanner(System.in);
		int i=0;
		while(i<3){
			System.out.println("������ѧ��ID:");
			String ID =console.next();
			//�жϸ�ID�Ƿ�ռ��
			Student st=students.get(ID);
			if(st==null)//δ��ռ�ã�����null 
			{
				System.out.println("������ѧ��������");
				String name= console.next();
				//�����µ�ѧ������
				Student newStudent=new Student(ID,name);
				//ͨ������Map�е�put������ID-ѧ��ӳ����ӵ�students ��
				students.put(ID, newStudent);
				System.out.println("�ɹ����ѧ����"+students.get(ID).name);
				i++;
			}else{
				System.out.println("ID�ѱ�ռ�ã�����������");
				continue;
			}
		}
	}
	/**
	 * ����Map��keySet ����
	 * @param args
	 */
	public void testKeySet(){
		Set<String> keySet =students.keySet();
		System.out.println("����"+students.size()+"��ѧ��");
		for(String stdId:keySet){
			Student st=students.get(stdId);
			if(st!=null){
				System.out.println("ѧ����"+st.name);
			}
		}
	}
	/**
	 * ����ɾ��Map�е�ӳ��
	 * @param args
	 */
	public void testRemove(){
		Scanner console =new Scanner(System.in);
		while(true){
			System.out.println("������Ҫɾ����ѧ����ID��");
			String ID=console.next();
			Student st=students.get(ID);
			if(st==null){
				System.out.println("��ID��Ӧ��ѧ�������ڣ�");
				continue;
			}
			students.remove(ID);
			System.out.println("ѧ��"+st.name+"�ѳɹ���ɾ����");
			break;
		}	
	}
	/**
	 * ����EntrySet����
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
	 * ����put�������޸�Map�����е�ӳ��
	 * @param args
	 */
	public void testModify(){
		System.out.println("������Ҫ�޸ĵ�ѧ��ID��");
		Scanner console = new Scanner(System.in);
		while(true){
			String stId=console.next();
			Student st=students.get(stId);
			//�ж�ID��Ӧ����Ϣ�Ƿ����
			if(st==null){
				System.out.println("��ID��Ӧ����Ϣ�����ڣ����������룡");
				continue;
			}
			//��ʾ��ǰѧ��ID��Ӧ��ѧ������
			System.out.println("��ID��Ӧ��ѧ������Ϊ"+st.name);
			//�޸���Ϣ
			System.out.println("�������µ�ѧ��������");
			String newName=console.next();
			Student newStudent=new Student(stId,newName);
			students.put(stId,newStudent);
			System.out.println("�޸ĳɹ���");
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
