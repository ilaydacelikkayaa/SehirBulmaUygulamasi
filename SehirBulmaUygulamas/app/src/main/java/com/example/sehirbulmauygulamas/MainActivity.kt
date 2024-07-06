package com.example.sehirbulmauygulamas

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sehirbulmauygulamas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.button.setOnClickListener {
            if (binding.editTextNumber.text.isNotEmpty()){
             var plakakodu=binding.editTextNumber.text.toString().toInt()
                val iller = listOf(
                    "Adana", "Adıyaman", "Afyonkarahisar", "Ağrı", "Amasya", "Ankara", "Antalya",
                    "Artvin", "Aydın", "Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur",
                    "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli", "Diyarbakır", "Edirne",
                    "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun", "Gümüşhane",
                    "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu",
                    "Kayseri", "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya",
                    "Manisa", "Kahramanmaraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu",
                    "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon",
                    "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray", "Bayburt",
                    "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova",
                    "Karabük", "Kilis", "Osmaniye", "Düzce"
                )
                val sehir=when(plakakodu){
                    1 -> iller[0]
                    2 -> iller[1]
                    3 -> iller[2]
                    4 -> iller[3]
                    5 -> iller[4]
                    6 -> iller[5]
                    7 -> iller[6]
                    8 -> iller[7]
                    9 -> iller[8]
                    10 -> iller[9]
                    11 -> iller[10]
                    12 -> iller[11]
                    13 -> iller[12]
                    14 -> iller[13]
                    15 -> iller[14]
                    16 -> iller[15]
                    17 -> iller[16]
                    18 -> iller[17]
                    19 -> iller[18]
                    20 -> iller[19]
                    21 -> iller[20]
                    22 -> iller[21]
                    23 -> iller[22]
                    24 -> iller[23]
                    25 -> iller[24]
                    26 -> iller[25]
                    27 -> iller[26]
                    28 -> iller[27]
                    29 -> iller[28]
                    30 -> iller[29]
                    31 -> iller[30]
                    32 -> iller[31]
                    33 -> iller[32]
                    34 -> iller[33]
                    35 -> iller[34]
                    36 -> iller[35]
                    37 -> iller[36]
                    38 -> iller[37]
                    39 -> iller[38]
                    40 -> iller[39]
                    41 -> iller[40]
                    42 -> iller[41]
                    43 -> iller[42]
                    44 -> iller[43]
                    45 -> iller[44]
                    46 -> iller[45]
                    47 -> iller[46]
                    48 -> iller[47]
                    49 -> iller[48]
                    50 -> iller[49]
                    51 -> iller[50]
                    52 -> iller[51]
                    53 -> iller[52]
                    54 -> iller[53]
                    55 -> iller[54]
                    56 -> iller[55]
                    57 -> iller[56]
                    58 -> iller[57]
                    59 -> iller[58]
                    60 -> iller[59]
                    61 -> iller[60]
                    62 -> iller[61]
                    63 -> iller[62]
                    64 -> iller[63]
                    65 -> iller[64]
                    66 -> iller[65]
                    67 -> iller[66]
                    68 -> iller[67]
                    69 -> iller[68]
                    70 -> iller[69]
                    71 -> iller[70]
                    72 -> iller[71]
                    73 -> iller[72]
                    74 -> iller[73]
                    75 -> iller[74]
                    76 -> iller[75]
                    77 -> iller[76]
                    78 -> iller[77]
                    79 -> iller[78]
                    80 -> iller[79]
                    81 -> iller[80]
                    else -> "Bilinmeyen plaka kodu"
                }
                binding.textView.text = sehir

            }
            else{
                binding.textView.text="Şehir Plaka kodu giriniz"
            }
            binding.editTextNumber.text.clear()
        }

    }
}