package info.metadude.android.typedpreferences;

import ohos.data.preferences.Preferences;

/**
 * A wrapper class for a int preference.
 */
public class IntPreference extends BasePreference {

    protected final int mDefaultValue;

    public static final int DEFAULT_VALUE_VALUE = 0;

    /**
     * Constructs a {@code int} preference for the given key
     * having the default value set to zero available.
     *
     * @param preferences pref.
     * @param key key.
     */
    public IntPreference(final Preferences preferences, final String key) {
        this(preferences, key, DEFAULT_VALUE_VALUE);
    }

    /**
     * Constructs a {@code int} preference for the given key
     * having the default value available.
     *
     * @param preferences pref.
     * @param key key.
     * @param defaultValue defaultval.
     */
    public IntPreference(final Preferences preferences, final String key, int defaultValue) {
        super(preferences, key);
        mDefaultValue = defaultValue;
    }

    /**
     * Returns the stored {@code int} value if it exists
     * or the default value.
     */
    public int get() {
        return mPreferences.getInt(mKey, mDefaultValue);
    }

    /**
     * Stores the given {@code int} value asynchronously.
     *
     * @param value val.
     */
    public void set(final int value) {
        mPreferences.putInt(mKey, value).flush();
    }
}
