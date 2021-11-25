package info.metadude.android.typedpreferences;

import ohos.data.preferences.Preferences;

class BasePreference {
    protected final Preferences mPreferences;
    protected final String mKey;

    public BasePreference(final Preferences preferences, final String key) {
        mPreferences = preferences;
        mKey = key;
    }

    /**
     * Returns {@code true} if some value is stored for
     * this preference, otherwise {@code false}.
     */
    public boolean isSet() {
        return mPreferences.hasKey(mKey);
    }

    /**
     * Removes this preference setting asynchronously.
     */
    public void delete() {
        mPreferences.delete(mKey).flush();
    }
}
