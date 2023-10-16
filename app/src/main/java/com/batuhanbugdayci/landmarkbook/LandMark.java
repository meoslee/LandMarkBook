package com.batuhanbugdayci.landmarkbook;
import android.os.Parcel;
import android.os.Parcelable;

public class LandMark implements Parcelable {
    String name;
    String country;
    int image;

    public LandMark(String name, String country, int image) {
        this.name = name;
        this.country = country;
        this.image = image;
    }

    protected LandMark(Parcel in) {
        name = in.readString();
        country = in.readString();
        image = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(country);
        dest.writeInt(image);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<LandMark> CREATOR = new Creator<LandMark>() {
        @Override
        public LandMark createFromParcel(Parcel in) {
            return new LandMark(in);
        }

        @Override
        public LandMark[] newArray(int size) {
            return new LandMark[size];
        }
    };

    // Getter ve Setter metodları
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getImage() {
        return image;
    }
}
