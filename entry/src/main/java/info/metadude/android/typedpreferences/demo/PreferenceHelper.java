package info.metadude.android.typedpreferences.demo;

import ohos.data.preferences.Preferences;
import info.metadude.android.typedpreferences.StringPreference;

/**
 * PreferenceHelper.
 */
public class PreferenceHelper {
    private static final String PREF_KEY_USER_INPUT = "USER_INPUT";
    private final StringPreference mUserInputPreference;

    public PreferenceHelper(final Preferences msharedPreferences) {
        mUserInputPreference = new StringPreference(
                msharedPreferences, PREF_KEY_USER_INPUT);
    }

    public void storeUserInput(final String userInput) {
        mUserInputPreference.set(userInput);
    }

    public String restoreUserInput() {
        return mUserInputPreference.get();
    }

    public boolean storesUserInput() {
        return mUserInputPreference.isSet();
    }

}
