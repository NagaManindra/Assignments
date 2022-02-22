import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface  Execute{
	int Sequence() default 12;
}

class MyClass{
	@Execute(Sequence=2)
	public void myMethod1(){
		
	}
	@Execute(Sequence=1)
	public void myMethod2(){
		
	}
	@Execute(Sequence=3)
	public void myMethod3(){
		
	}
}
public class AnnotationQ3 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		MyClass objClass =new MyClass();
		Class c =objClass.getClass();
		Method method=c.getMethod("myMethod3");
		Execute annotation = method.getAnnotation(Execute.class);
		System.out.println(((Execute) annotation).Sequence()); 

	}

}
