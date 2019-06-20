package cc.brainbook.android.project.login.resetpassword.exception;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ResetPasswordException extends RuntimeException {
    public static final int EXCEPTION_IO_EXCEPTION = -3;
    public static final int EXCEPTION_UNKNOWN = -2;
    public static final int EXCEPTION_INVALID_PARAMETERS = -1;
    public static final int EXCEPTION_CANNOT_RESET_PASSWORD = 1;

    private int code;

    public ResetPasswordException(@ExceptionType int code) {
        this.code = code;
    }

    public ResetPasswordException(@ExceptionType int code, String message) {
        super(message);
        this.code = code;
    }

    public ResetPasswordException(@ExceptionType int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public ResetPasswordException(@ExceptionType int code, Throwable cause) {
        super(cause);
        this.code = code;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Exception type.
     */
    @IntDef({EXCEPTION_IO_EXCEPTION,
            EXCEPTION_UNKNOWN,
            EXCEPTION_INVALID_PARAMETERS,
            EXCEPTION_CANNOT_RESET_PASSWORD
    })
    @Retention(RetentionPolicy.SOURCE)
    public @interface ExceptionType {}

}