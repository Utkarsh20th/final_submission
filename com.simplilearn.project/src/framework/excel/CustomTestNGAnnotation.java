package framework.excel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention (RetentionPolicy.RUNTIME)
public @interface CustomTestNGAnnotation {
	int value() default 0;	

}
