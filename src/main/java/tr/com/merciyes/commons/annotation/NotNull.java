package tr.com.merciyes.commons.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
@Documented
public @interface NotNull {

    String message() default "Field cannot be null.";
}