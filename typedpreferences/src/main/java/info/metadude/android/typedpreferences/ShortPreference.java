package info.metadude.android.typedpreferences;

import ohos.data.preferences.Preferences;

/**
 * A wrapper class for a {@code short} preference that reuses IntPreference.
 */
public class ShortPreference {

    protected final IntPreference mIntPreference;

    public static final short DEFAULT_VALUE_VALUE = (short) IntPreference.DEFAULT_VALUE_VALUE;

    /**
     * ShortPreference.
     *
     * @param preferences pref.
     * @param key key.
     */
    public ShortPreference(final Preferences preferences, final String key) {
        this(preferences, key, DEFAULT_VALUE_VALUE);
    }

    /**
     * Short.
     *
     * @param preferences pref.
     * @param key key.
     * @param defaultValue defaultval.
     */
    public ShortPreference(final Preferences preferences, final String key, int defaultValue) {
        mIntPreference = new IntPreference(preferences, key, defaultValue);
    }

    /**
     * Returns the stored {@code short} value if it exists
     * or the default value.
     */
    public short get() {
        return (short) mIntPreference.get();
    }

    /**
     * Returns {@code true} if some value is stored for
     * this preference, otherwise {@code false}.
     */
    public boolean isSet() {
        return mIntPreference.isSet();
    }

    /**
     * value.
     *
     * @param value val.
     */
    public void set(final short value) {
        mIntPreference.set(value);
    }

    /**
     * Removes this preference setting asynchronously.
     */
    public void delete() {
        mIntPreference.delete();
    }
}
