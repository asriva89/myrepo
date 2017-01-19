package Jpract;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class SoapC {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		Class abc=pract_ssh.class;
		System.out.println(abc.getName());
		System.out.println(abc.getSimpleName());
		int modifiers = abc.getModifiers();
		System.out.println(modifiers);
		System.out.println(Modifier.isPublic(modifiers));
		System.out.println(Modifier.isPrivate(modifiers));
		System.out.println(Modifier.isStatic(1));
		Package p1=abc.getPackage();
		Class superclass= abc.getSuperclass();
		System.out.println(superclass.getName());
		System.out.println(p1.getName());
		Method[] meth=abc.getMethods();
		String meth2 = meth[0].toString();
		System.out.println(meth2);
		Constructor[] cs=abc.getConstructors();
		//System.out.println(cs[0].getName());
		Field[] mv =abc.getFields();
		System.out.println(mv[1].getName());
		Object fieldTye = mv[1].getType();
		//Object Ft=mv[2].getType();
		System.out.println(fieldTye);
		//pract_ssh s1= new pract_ssh();
//		Object value = mv[0].get(s1);
//		System.out.println(value);
//		mv[1].set(s1, 21);
//		mv[1].set(s1, 23);
//		Object value2 = mv[1].get(s1);
//		System.out.println(value2);
		
		//++++++++++++++++++++++++++=
		pract_ssh a=new pract_ssh(200);
		try {
			Field x= abc.getDeclaredField("c");
			x.setAccessible(true);
			int d=(int) x.get(a);
			System.out.println(d);
			
			
		} catch (NoSuchFieldException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Method j=abc.getDeclaredMethod("print", new Class[]{int.class});
		 j.setAccessible(true);
		 try {
			j.invoke(a, 10);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
