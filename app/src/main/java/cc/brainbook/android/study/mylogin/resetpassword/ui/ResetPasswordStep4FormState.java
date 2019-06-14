package cc.brainbook.android.study.mylogin.resetpassword.ui;

import android.support.annotation.Nullable;

/**
 * Data validation state.
 */
class ResetPasswordStep4FormState {
    @Nullable
    private Integer passwordError;
    @Nullable
    private Integer repeatPasswordError;

    ResetPasswordStep4FormState(@Nullable Integer passwordError, @Nullable Integer repeatPasswordError) {
        this.passwordError = passwordError;
        this.repeatPasswordError = repeatPasswordError;
    }

    @Nullable
    Integer getPasswordError() {
        return passwordError;
    }

    @Nullable
    Integer getRepeatPasswordError() {
        return repeatPasswordError;
    }

    boolean isDataValid() {
        return passwordError == null && repeatPasswordError == null;
    }
}