package Validation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import javax.validation.Payload;

@Constraint(validatedBy = ValidarEmailReglasValidacion.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidarCorreo {
	String message() default "El correo no es correcto";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};

}
