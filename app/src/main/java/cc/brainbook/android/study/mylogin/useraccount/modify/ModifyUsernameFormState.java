package cc.brainbook.android.study.mylogin.useraccount.modify;

import android.support.annotation.Nullable;

/**
 * Data validation state.
 */
class ModifyUsernameFormState {
    @Nullable
    private Integer usernameError;

    ModifyUsernameFormState(@Nullable Integer usernameError) {
        this.usernameError = usernameError;
    }

    @Nullable
    Integer getUsernameError() {
        return usernameError;
    }

    boolean isDataValid() {
        return usernameError == null;
    }
}