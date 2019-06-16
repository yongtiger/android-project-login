package cc.brainbook.android.study.mylogin.useraccount.modify;

import android.support.annotation.Nullable;

/**
 * Data validation state.
 */
class ModifyPasswordFormState {
    @Nullable
    private Integer passwordError;
    @Nullable
    private Integer repeatPasswordError;

    ModifyPasswordFormState(@Nullable Integer passwordError, @Nullable Integer repeatPasswordError) {
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