package com.mosheparfait.realsizehd;

public class CConverter implements IConverter {

	//Computer
    //8 bit     = 1 byte
    //1024 byte = 1kB
    //1024 kB   = 1 MB
    //1024 MB   = 1 GB
    //1024 GB   = 1 TB

    //1 TB = 1024 Byte * 1024 KB * 1024 MB * 1024 GB = 1099511627776 Byte;
    //1 GB = 1024 Byte * 1024 KB * 1024 MB = 1073741824 Byte
    //1 MB = 1024 Byte * 1024 KB = 1048576 Byte

    //Factory
    //1 TB = 1000 Byte * 1000 KB * 1000 MB * 1000 GB = 1000000000000 Byte
    //1 GB = 1000 Byte * 1000 KB * 1000 MB = 1000000000 Byte

    //Thank you knowledge from
    //ว่าด้วยเรื่องขนาดความจุของ Harddisk: http://www.vbeetech.com/index.php?text_id=1&&sub_text_id=2
    //เรื่องของ Bit Byte: http://kasipon.blogspot.com/2011/05/bit-byte.html

    public final long facOneGB = 1000000000;
    public final long comOneGB = 1073741824;
    public final int comOneMB = 1048576;

    private double _sizeMB = 0;
    private double _sizeGB = 0;
    private double _sizeTB = 0;

    public CConverter(String strFacSize)
    {
        if (strFacSize == "4TB")
            calFromTB(4);
        else if (strFacSize == "2TB")
            calFromTB(2);
        else if (strFacSize == "1TB")
            calFromTB(1);
        else if (strFacSize == "500GB")
            calFromGB(500);
        else if (strFacSize == "250GB")
            calFromGB(250);
        else if (strFacSize == "125GB")
            calFromGB(125);
        else if (strFacSize == "480GB")
            calFromGB(480);
        else if (strFacSize == "240GB")
            calFromGB(240);
        else if (strFacSize == "120GB")
            calFromGB(120);
    }

    private void calFromTB(int iTB)
    {
        this._sizeGB = facOneGB * 1000 * iTB / comOneGB;
        this._sizeTB = this._sizeGB / 1024;
        this._sizeMB = this._sizeGB * 1024;
    }

    private void calFromGB(int iGB)
    {
        this._sizeGB = facOneGB * iGB / comOneGB;
        this._sizeTB = this._sizeGB / 1024;
        this._sizeMB = this._sizeGB * 1024;
    }
	
	@Override
	public double getSizeMB() {
		return _sizeMB;
	}

	@Override
	public double getSizeGB() {
		return _sizeGB;
	}

	@Override
	public double getSizeTB() {
		return _sizeTB;
	}

	@Override
	public String getStringMB() {
		return String.format("%.2f MB", _sizeMB);
	}
	
	@Override
	public String getStringGB() {
		return String.format("%.2f GB", _sizeGB);
	}
	
	@Override
	public String getStringTB() {
		return String.format("%.2f TB", _sizeTB);
	}
}
