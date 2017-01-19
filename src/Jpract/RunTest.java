package Jpract;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RunTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testing...");
		int passed=0, failed =0 , ignore=0 ,count =0;
		Class<TestExample> a=TestExample.class;
		if( a.isAnnotationPresent(TesterInfo.class)){
			Annotation an=a.getAnnotation(TesterInfo.class);
			TesterInfo ti=(TesterInfo)an;
			System.out.println(" Priotity is :"+ti.priority());
			System.out.println("Created by :"+ ti.createdBy());
			System.out.println("Tags :");
			int tl = ti.tags().length;
			for (String tag: ti.tags())
			{
				if ( tl >1)
				 System.out.println(tag + ",");
				else
					System.out.println(tag);
				tl--;
			}
			System.out.println("Last Modified :"+ti.lastModified());
			
		}
		
		TestExample b = new TestExample();
		for (Method meth: a.getDeclaredMethods())
		{
			 if (meth.isAnnotationPresent(Test.class)){
				 Annotation ant = meth.getAnnotation(Test.class);
				 Test test =(Test)ant;
				 if(test.enabled()){
					 try{
						 meth.invoke(b);
						  count++;
						 System.out.println("Test passed :"+count+meth.getName());
						 passed++;
						 }
					 catch(Throwable ex){
						 count++;
						 System.out.println("Test failed :" + count + meth.getName()+ex.getCause());
						 failed++;
					 }
			
				 }
				 else
				 {
					 count++;
					 System.out.println("Test ignored" +count+meth.getName() );
					 ignore++;
				 }
			 }
		}
		System.out.printf("%nResult : Total : %d, Passed: %d, Failed %d, Ignore %d%n", count, passed, failed, ignore);

		

	}
	
	

}
