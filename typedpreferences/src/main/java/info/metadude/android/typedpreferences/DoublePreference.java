package info.metadude.android.typedpreferences;

import ohos.data.preferences.Preferences;

/**
 * A wrapper class to store and restore a double value in preferences.
 */
public class DoublePreference {
    protected LongPreference mLongPreference;
    public static final double DEFAULT_VALUE_VALUE = 0d;

    /**
     * Constructs a {@code double} preference for the given key
     * having the default value set to zero available.
     *
     * @param preferences pref.
     * @param key key.
     */
    public DoublePreference(Preferences preferences, String key) {
        this(preferences, key, DEFAULT_VALUE_VALUE);
    }

    /**
     * Constructs a {@code double} preference for the given key
     * having the default value available.
     *
     * @param preferences pref.
     * @param key key.
     * @param defaultValue defaultval.
     */
    public DoublePreference(Preferences preferences, String key, double defaultValue) {
        mLongPreference = new LongPreference(preferences, key, Double.doubleToLongBits(defaultValue));
    }

    /**
     * Returns the stored {@code double} value if it exists
     * or the default value.
     */
    public double get() {
        return Double.longBitsToDouble(mLongPreference.get());
    }

    /**
     * Returns {@code true} if some value is stored for
     * this preference, otherwise {@code false}.
     */
    public boolean isSet() {
        return mLongPreference.isSet();
    }

    /**
     * Stores the given {@code double} value asynchronously.
     *
     * @param value val.
     */
    public void set(double value) {
        mLongPreference.set(Double.doubleToLongBits(value));
    }

    /**
     * Removes this preference setting asynchronously.
     */
    public void delete() {
        mLongPreference.delete();
    }
}
