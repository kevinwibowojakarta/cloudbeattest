package config;

public class Constant {
	public static String DEVICENAME;
	public static String UDID;
	public static String PLATFORMNAME;
	public static String PLATFORMVERSION;
	public static String APPPACKAGE;
	public static String APPACTIVITY;
	public static String AUTOMATIONNAME;
	public static String phoneNumber;
	public static String pin;
	public static String password;
	public static String DBUser;
	public static String DBPass;
	
	public static String stagingEndpointAddress="secure.payfazz.com/automation-api-dev/37h7cjfym0keh51j";
	
	//Constant Test Rail
	public static int payfazzProjectID=5;
	public static int payfazzRegressionSuiteID=6;
	public static String testRailAddress="https://payfazz.testrail.io/";



	
	// Akun memiliki saldo 1 juta, sudah KYC dan tidak terkena block dormant
	public static String phoneNumber0 = "087812120000";
	public static String phoneNumber1 = "087812120001";

	public static String phoneNumberForgotPassword1 = "081512121114";
	public static String phoneNumberForgotPassword2 = "081512121119";

	public static String phoneNumberMultiLogin = "081288880000";

	// Akun New Register
	public static String phoneNumberNewRegister = "081512121123";
	public static String storeNameNewRegister = "Toko Baru Auto";

	// Akun Not Registered
	public static String phoneNumberNotRegistered = "087812128888";
	public static String passwordNotRegistered = "PasswordSalah01";
	public static String OTPNotRegistered = "123456";
	public static String PINNotregistered = "111111";
	
	// Reguler Account without Upline
	public static String phoneNumberRegAccountWithoutUpline="081322193924";

	// Premium Account without Upline
	public static String phoneNumberPreAccountWithoutUpline="08130000";

	// Super Premium Account without Upline
	public static String phoneNumberSuPreAccountwithoutUpline="08130001";

	// Akun Terkena Block Appeal Form
	public static String phoneNumberAppeal1 = "082314140034";
	public static String phoneNumberAppeal2 = "082314140035";
    public static String phoneNumberAppealAlreadySubmitted = "08231414";

	// Appeal Form
	public static String formAppeal1 = "Informasi Data Diri";
	public static String formAppeal2 = "Alasan Penonaktifan Akses Akun";
	public static String formAppeal3 = "Dokumen Tambahan";

	// Akun Upline Premium (Tidak dimasukan KYC Non KYC karena bukan mengecek KYC)
	public static String uplinePremium = "081320207";
	public static String referalUplinePremium = "UPLLLTZYFP";

    // Akun Upline Premium (Tidak dimasukan KYC Non KYC karena bukan mengecek KYC)
    public static String uplineSuperPremium = "081320208";
    public static String referalUplineSuperPremium = "UPLP35UW26";
	
	// Akun Upline Super Premium Sudah KYC
	public static String phoneNumberUplineSuperPremium = "081512120015";
	//public static String referalUplineSuperPremium = "KIL2A7N654";

	// AKun Premium Punya Upline (081512120015) dan Downline (081566660001)
	public static String phoneNumberPreHaveUplineAndDownline= "081566660000";
	// Refereal : DEREC76RNE

	// AKun Super Premium Punya Upline (081512120015) dan Downline (081577770001)
	public static String phoneNumberSuPreHaveUplineAndDownline= "081577770000";
	// Refereal : GUY3X8T4ZF

	// Akun Downline Reguler dari 081512120014 with balance and without balance
	public static String phoneNumberDownlineRegWithBalance1 = "081512121126";
	public static String phoneNumberDownlineRegWithoutBalance1 = "081512121124";

	// Akun Downline Premium dari 081512120014 with balance and without balance
	public static String phoneNumberDownlinePreWithBalance1 = "081512121115";
	// 081512121116, 081512121113
	// , 081512121117,
	public static String phoneNumberDownlinePreWithoutBalance1 = "081512121111";

	// Akun Downline Super Premium dari 081512120014 with balance and without balance
	public static String phoneNumberDownlineSuPreWithBalance1 = "081512121112";
	// 081512121122 , 081512121121 , 081512121120 , 081512121125 , 081512121110
	public static String phoneNumberDownlineSuPreWithoutBalance1 = "081512121123";

	// Akun Downline Reguler dari 081512120015 with balance and without balance
	public static String phoneNumberDownlineRegWithBalance2 = "081513131117";
	public static String phoneNumberDownlineRegWitouthBalance2 = "081513131120";
	
	// Akun Downline Premium dari 081512120015 with balance and without balance
	public static String phoneNumberDownlinePreWithoutBalance2 = "081513131112";
	public static String phoneNumberDownlinePreWithBalance2 = "081513131121";

	// Akun Downline Premium dari 081512120014
	public static String phoneNumberDownlinePremium="081512121111";
	//081512121112 , 081512121116 , 081512121113 , 081512121114 , 081512121115 , 081512121110 , 081512121117 , 081512121118 , 081512121119
	//081512121120 , 081512121121
	// Akun Downline Super Premium dari 081512120014

	// Downline dari 081320207 Reguler (Tidak dimasukan KYC Non KYC karena bukan mengecek KYC)
	public  static String downlineRegulerFromUplinePremium = "081320209";

	// Downline dari 081320208 Reguler (Tidak dimasukan KYC Non KYC karena bukan mengecek KYC)
	public  static String downlineRegulerFromUplineSuperPremium = "0813202012";

	// Downline dari 081320207 Premium (Tidak dimasukan KYC Non KYC karena bukan mengecek KYC)
	public  static String downlinePremiumFromUplinePremium = "0813202010";

    // Downline dari 081320208 Super Premium (Tidak dimasukan KYC Non KYC karena bukan mengecek KYC)
    public  static String downlinePremiumFromUplineSuperPremium = "0813202013";

	// Downline dari 081320207 Super Premium (Tidak dimasukan KYC Non KYC karena bukan mengecek KYC)
	public  static String downlineSuperPremiumFromUplinePremium = "0813202011";

	// Downline dari 081320207 Super Premium (Tidak dimasukan KYC Non KYC karena bukan mengecek KYC)
	public  static String downlineSuperPremiumFromUplineSuperPremium = "0813202014";

	//Akun Iroma
	public static String phoneNumberIroma="081220082019";
	public static String phoneNumberIroma2="089663968761";
	public static String phoneNumber2kontak="082314140023";
	public static String passwordIroma="Qwertyasdf1";

	// Akun Downline Super Premium dari 081512120015 with balance and without balance
	public static String phoneNumberDownlineSuPreWithoutBalance2 = "081513131115";
	public static String phoneNumberDownlineSuPreWithBalance2 = "081513131111"; // 081513131114

    public static String namaPenerimaHadiah="Payfazz Unicorn";

	// Akun untuk Klaim HP, Referal GUTRUWKLJE
	public static String phoneNumberWithPremiumAgent49 ="08151111";
	public static String phoneNumberDownline49 = "081511110";
	public static String phoneNumberClaimPrizeHPWithoutKYC = "081522224999";
	public static String phoneNumberClaimPrizeHPWithKYC = "081511110399";

	// Klaim Hadiah Laptop, Referal Akun 399 : PUYT57FKC9
	public static String phoneNumberWithPremiumAgent399 ="08153333";
	public static String phoneNumberDownline399 = "081533330";
	public static String phoneNumberClaimPrizeLaptopWithoutKYC ="081522224999";
	public static String phoneNumberClaimPrizeLaptopWithKYC = "081511110399";

	// Klaim Hadiah PP Umroh, Referal Akun 999 : HUJEE25TJ9
	public static String phoneNumberWithPremiumAgent999 ="08154444";
	public static String phoneNumberDownline999 = "081544440";
	public static String phoneNumberClaimPrizeUmrohWithoutKYC ="081522224999";
	public static String phoneNumberClaimPrizeUmrohWithKYC = "081511110399";

	// Klaim Hadiah Mobil, Referal Akun 4999 : RUTL5XAKZK
	public static String phoneNumberWithPremiumAgent4999 ="08156666";
	public static String phoneNumberDownline4999 = "081566660";
	public static String phoneNumberClaimPrizeMobilWithoutKYC ="081522224999";
	public static String phoneNumberClaimPrizeMobilWithKYC = "081511110399";
	
	// Data Informasi Penerima
	public static String recipientName = "Payfazz Unicorn";
	public static String nameLicenseHolder = "Lisensi Payfazz";
	public static String province = "DKI JAKARTA";
	public static String districtCity = "JAKARTA PUSAT";
	public static String subdistrict = "GAMBIR";
	public static String village = "GAMBIR";
	public static String postalCode = "10110";
	public static String addressText = "Jalan Medan Merdeka No. 45";
	
	// Cashback
	public static String cashbackTransaction = "Rp 50";
	public static String cashbackTransferBank = "Rp 250";
	public static String cashbackUpgradePremium = "Rp 50.000";
	public static String cashbackUpgradeSPPremium = "Rp 150.000";
	public static String cashbackBonus50Premium = "Rp 1.455.000";
	public static String cashbackBonus400Premium = "Rp 10.670.000";
	public static String cashbackBonus1000Premium = "Rp 19.400.000";
	public static String cashbackBonus5000Premium = "Rp 97.000.000";
	public static String cashbackBonusSuper = "Rp 1.000.000";

	// Total Agent Super
	public static String totalAgentSuper = "1 Agen Lagi";
	public static String totalAgentSuperDefault = "15 Agen Lagi";

	// Topup
	public static String buttonSudahBayar="SAYA SUDAH BAYAR";

	// PIN Default
	public static String PINDefault = "123456";

	// Password Default
	public static String passwordDefault = "Password01";

	// Email

	public static String emailUsed = "day@gmail.com";
	public static String emailInvalid = "payfazz";
	public static String emailNew = "day2@gmail.com";

	// Phone Number Invalid
	public static String phoneNumberInvalid = "0081322193924";

	// Error Message
	// Login
	public static String errorMessageLogin = "No hp atau password salah";

	// OTP
	public static String errorMessageOTP = "OTP tidak benar / sudah kedaluwarsa";
	public static String errorMessageOTPAfterTimeout = "kode otp tidak ditemukan / sudah kadaluarsa";

	// Register
	public static String errorMessageRegister = "No HP sudah terdaftar";
	public static String errorMessagePhoneNumberInvalid = "No HP tidak valid";

	// REFERAL
	public static String errorMessageReferal= "Kode referral tidak terdaftar";

	// Password
	public static String errorMessagePasswordNotmatch = "Password Tidak Sama";
	public static String errorMessageActiveSession = "Sesi lain terdeteksi aktif, tidak dapat melakukan perubahan password";
	public static String errorMessageForgotPasswordNeverLoginDevice = "Anda tidak dapat melakukan perubahan password, Silakan hubungi CS kami di cs@payfazz.com atau 021-5011-2000.";
	public static String errorMessageWrongPassword = "Password Anda Salah";

	// PIN
	public static String errorMessagePINNotMatch = "PIN Verifikasi tidak sesuai";
	public static String errorMessagePINSalah = "Pin salah";

	// Email
	public static String errorMessageEmailInvalid = "Email tidak valid";
	public static String errorMessageEmailUsed = "Email tersebut sudah pernah digunakan, silahkan gunakan email yang lain.";

	// Keagenan
	public static String errorMessageBalanceNotSufficient = "saldo wallet tidak cukup untuk melanjutkan transaksi";

	// Klaim Hadiah
	public static String errorMessageNotEnoughBalancePayTaxes ="Saldo tidak mencukupi";

	// Topup
	public static String errorMessageExceedAmountTopupNonKyc="Deposit tidak boleh melebihi Rp2.000.000";

	// Kasbon
	public static String errorMessageInvalidWithdrawCode="Kode penarikan tidak tersedia";
	public static String fiturTerkunciAkunKasbon="Lakukan Verifikasi Akun untuk dapat menggunakan Fitur Ini";
	public static String fiturTerkunciTokoKasbon="Verifikasi akun dan toko Anda untuk menggunakan fitur ini";

	public static String verifikasiAkunBerhasil="Verifikasi anda telah berhasil. Kini, Anda dapat menikmati keuntungan, seperti kenaikan limit hingga transfer dana dan kirim saldo.";
	public static String verifikasiTokoBerhasil="Verifikasi toko Anda berhasil. Yuk optimalkan fitur ini dan dapatkan keuntungan yang lebih besar.";
	public static String akunBelumDiverifikasi="Ayo verifikasi dasar untuk mendapatkan beragam keuntungan lebih, seperti kenaikan limit hingga transfer dana dan kirim saldo.";
	public static String tokoBelumDiverifikasi="Dengan verifikasi toko, Anda bisa memperlihatkan produk yang Anda jual ke pengguna lain.";

	// Target Agen
	public static String targetAgent5 = "5x Transaksi Lagi";
	public static String targetAgent4 = "4x Transaksi Lagi";
	public static String targetAgent3 = "3x Transaksi Lagi";
	public static String targetAgent2 = "2x Transaksi Lagi";
	public static String targetAgent1 = "1x Transaksi Lagi";

	// SELFHELP
	public static String FAQ="Pertanyaan yang Sering Diajukan";
    public static String hasilPencarianPulsa="Ditemukan 25 artikel tentang \"pulsa\"";
    public static String hasilPencarianTidakDitemukan="Hasil Pencarian Tidak Ditemukan";
    public static String titleNomorRekening="Masukkan Nomor Rekening Pemilik Kartu";
    public static String titleDigitRekening="Masukkan 6 Digit Terakhir Kartu Debit";

	//Transfer balance should be verified account
	public static String errorMessageNotVerifiedAccount="Lakukan Verifikasi Akun untuk dapat menggunakan Fitur Ini";

	//Prabayar Data
	public static String errorMessageBuySameProductData="Nomor ini telah diisi ulang dengan nominal ini untuk hari ini";

	// Transfer Bank
	public static String errorMessageTransferbank = "Maksimal nominal transfer Rp. 10.000.000";

	// COACHMARK
	public static String coachmarkInbox = "Temukan beragam promo dan informasi terbaru tentang produk PAYFAZZ di sini.";
	public static String coachmarkTopup = "Gunakan tombol ini untuk melakukan pengisian saldo akun PAYFAZZ Anda.";
	public static String coachmarkKredit = "Tap bagian ini untuk menggunakan fitur Kredit Agen.";
	public static String coachmarkKreditButton = "Gunakan fitur Kredit Agen sebagai tambahan modal usaha Anda.";
	public static String coachmarkKasir = "Catat transaksi dan buat laporan bulanan di sini.";
	public static String coachmarkDormant = "Tap tombol 'Target Agen' untuk mengetahui riwayat target transaksi Anda.";
	public static String coachmarkTargetTransaksi = "'Target Bulan Ini' menginformasikan apakah Anda berhasil memenuhi target agen atau tidak.";
	public static String coachmarkKeagenan = "Gunakan ini untuk meningkatkan status keagenan Anda.";
	public static String coachmarkHubungiKami = "Gunakan bantuan ini apabila Anda mengalami kendala saat menggunakan PAYFAZZ.";
	public static String coachmarkVerifikasiAkun = "Tap tombol 'Verifikasi Akun' untuk memverifikasi akun Anda.";

	// Coupon
	public static String errorMessageKuponTidakDitemukan = "Kupon tidak ditemukan";
	public static String errorMessageKodePromoTidakTersedia = "Kode promo tidak tersedia";
	public static String errorMessageKuponTransaksiTidakSesuai = "Kode promo tidak dapat digunakan untuk transaksi ini";
	public static String errorMessageKodePromoKedaluwarsa="Kode promo belum dapat digunakan atau telah kedaluwarsa";
	public static String errorMessageKuponMelebihiBatasMaksimum = "Kode promo sudah melebihi batas pengunaan";
	public static String errorMessageKuponKurangMinimumTransaksi="Kode promo tidak dapat digunakan karena belum memenuhi batas minimal";
	public static String banner_text_coupon="Punya Kode Kupon Sendiri?";

	//Prabayar Token PLN
	public static String idTokenPelanggan="29032019";

	//Tag Status
	public static String tagStatusBerhasil="Berhasil";
	public static String tagStatusMenunggu="Menunggu";
	public static String tagStatusDiprosesOperator="Diproses Operator";
	public static String tagStatusRefund = "Refund";
	public static String tagStatusBatal="Batal";
	public static String tagStatusKedaluwarsa ="Kedaluwarsa";

		//Pascabayar PLN
		public static String noMeteran = "0309201915";
		public static String errorMessageNoMeteranKurang="Jumlah karakter minimal 11";

		// Pascabayar PGN
		public static String pgnNumber="0110014649";

		// Pascabayar BPJS
		public static String bpjsNumber="0002299822929";

		//Pascabayar PDAM
		public static String pdamNumber="A209221";
		public static String errorMessageTimeout="TIMEOUT";
		public static String errorMessagePdamNumberInvalid="No pelanggan tidak ditemukan";
		public static String errorMessageProdukTidakTerdaftar="Produk tidak terdaftar";

		//Pascabayar TV Berlangganan
		public static String tvLanggananNumber="1116947179";

		// Pascabayar Telkom
		public static String telkomNumber ="09213119475";

		// Pascabayar Multifinance
		public static String multifinanceNumber="7141600478";

		// Transfer Bank
		public static String accountNumber="6840509000";

		// Detail Transaksi Topup
		public static String unique_code_words="Transfer tepat sampai 2 digit terakhir. Kesalahan pencantuman nomor rekening tujuan dan atau jumlah transfer merupakan tanggung jawab agen sepenuhnya.";

	// Coupon
//	public static String couponGeneral="KUISDANGDUT";
	public static String couponGeneral="VBNIG8WGH4IU3ODB";
	public static String couponPulsa="DISKONPULSA";
	public static String couponData="TANPAMINIMUM"
;	public static String couponTopup="TOPUPONLY";
	public static String couponUsed="DISC77K";
	public static String couponFullQuota= "DIS";

	public static void DefaultValue(){

		System.out.println("INITIATING DEFAULT CONSTANTS");
		DEVICENAME = "Nexus One API 27";
		UDID = "emulator-5554";
		PLATFORMNAME = "Android";
		PLATFORMVERSION = "8.1.0";
		APPPACKAGE = "com.payfazz.android.debug";
		APPACTIVITY = "com.payfazz.android.splash.presentation.activity.SplashActivity";
		AUTOMATIONNAME = "uiautomator2";
		phoneNumber = "081269696969";
		pin = "123456";
		password = "Apex1234";
	
		System.out.println("~~FINISH INITIATING DEFAULT CONSTANTS");

	}

	// * --	Constant for Web Testing	-- *//

	// Url Dashboard Agent Management System (AMS)
	public static String URL_AMS="https://secure.payfazz.com/payfazz-agent-directory/260771b5/";

	// Authentication
	public static final String USERNAME = "iroma.pesta@payfazz.com";
	public static final String PASSWORD = "sukmawaty15jelek";

	// user account
    public static final String user_id = "364553";
    public static final String user_name= "Dormant3";
    public static final String user_phone_number="087813130005";
    public static final String user_email="day@gmail.com";

    // Store account
	public static String store_id= "1401758";

    // error message Dashboard Agent Management System (AMS)
	public static String errorMessageSearchMoreCharacters="Please search with three or more character";

	// Kasbon
	public static String phoneNumberKasbon25K="082210020003";
	public static String passwordKasbon="123456";
}
