package info.metadude.android.typedpreferences;

import ohos.data.preferences.Preferences;

/**
 * A wrapper class for a long preference.
 */
public class LongPreference extends BasePreference {

    protected final long mDefaultValue;

    public static final long DEFAULT_VALUE_VALUE = 0L;

    /**
     * Constructs a {@code long} preference for the given key
     * having the default value set to {@code 0} available.
     *
     * @param preferences pref.
     * @param key key.
     */
    public LongPreference(final Preferences preferences, final String key) {
        this(preferences, key, DEFAULT_VALUE_VALUE);
    }

    /**
     * Constructs a {@code long} preference for the given key
     * having the default value available.
     *
     * @param preferences pref.
     * @param key key.
     * @param defaultValue defaultval.
     */
    public LongPreference(final Preferences preferences, final String key, long defaultValue) {
        super(preferences, key);
        mDefaultValue = defaultValue;
    }

    /**
     * Returns the stored {@code long} value if it exists
     * or the default value.
     */
    public long get() {
        return mPreferences.getLong(mKey, mDefaultValue);
    }

    /**
     * Stores the given {@code long} value asynchronously.
     *
     * @param value val.
     */
    public void set(long value) {
        mPreferences.putLong(mKey, value).flush();
    }
}
