package com.ironsoftware.dortislemkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun toplama(view : View) {
        var sayi1 = editText.text.toString().toIntOrNull()
        var sayi2 = editText2.text.toString().toIntOrNull()
        if (sayi1 == null || sayi2 == null){
            textView2.text="Sayı Girmeyi Unutmayın!!!"
        }else{
            var sonuc=sayi1+sayi2
            textView2.text="  Sonuç: ${sonuc}"
        }
    }
    fun cikarma(view : View){
        var sayi1 = editText.text.toString().toIntOrNull()
        var sayi2 = editText2.text.toString().toIntOrNull()
        if (sayi1 == null || sayi2 == null){
            textView2.text="Sayı Girmeyi Unutmayın!!!"
        }else{
            var sonuc=sayi1-sayi2
            textView2.text="  Sonuç: ${sonuc}"
        }
    }
    fun carpma(view : View){
        var sayi1 = editText.text.toString().toIntOrNull()
        var sayi2 = editText2.text.toString().toIntOrNull()
        if (sayi1 == null || sayi2 == null){
            textView2.text="Sayı Girmeyi Unutmayın!!!"
        }else{
            var sonuc=sayi1*sayi2
            textView2.text=" Sonuç: ${sonuc}"
        }
    }
    fun bolme(view : View){
        var sayi1 = editText.text.toString().toDoubleOrNull()
        var sayi2 = editText2.text.toString().toDoubleOrNull()
        if (sayi1 == null || sayi2 == null){
            textView2.text="Sayı Girmeyi Unutmayın!!!"
        }else{
            var sonuc=sayi1/sayi2
        textView2.text=" Sonuç: ${sonuc}"
        }
    }
}