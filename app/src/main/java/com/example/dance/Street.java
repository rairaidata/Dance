package com.example.dance;

/**
 * Created by 聡一朗 on 2016/06/19.
 */
public enum Street {
    Ocat("OCAT", "難波", "09:00～18:00", R.drawable.ocat),
    Haniba("阪急茨木市駅", "茨木市", "09:00～18:00", R.drawable.haniba),
    Siyakusyo("高槻市役所", "高槻市", "18:00～24:00", R.drawable.siyakusyo),;


    public String name;
    public String address;
    public String time;
    public int image;

    Street(String name, String address, String time, int image) {
        this.name = name;
        this.address = address;
        this.time = time;
        this.image = image;


    }


}
