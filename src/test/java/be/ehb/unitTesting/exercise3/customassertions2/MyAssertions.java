package be.ehb.unitTesting.exercise3.customassertions2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.Assert;

public class MyAssertions {
	public static ArrayList<Method> getGetters(Class<?> aClass) {

		Method[] methods = aClass.getMethods();
		ArrayList<Method> getters = new ArrayList<Method>();
		for (Method method : methods) {
			if (isGetter(method))
				getters.add(method);
		}
		return getters;
	}

	public static boolean isGetter(Method method) {
		if (!method.getName().startsWith("get")
				&& !method.getName().startsWith("is"))
			return false;
		if (method.getParameterTypes().length != 0)
			return false;
		if (void.class.equals(method.getReturnType()))
			return false;
		return true;
	}

	public static void customEquals(Object expected, Object actual)
			throws IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {


		for (Method m : getGetters(expected.getClass()))
			Assert.assertEquals(m.invoke(expected), m.invoke(actual));

	}

}
