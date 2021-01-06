package com.example.whiskysample.ui.scan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.whiskysample.R
import com.google.zxing.integration.android.IntentIntegrator
import com.google.zxing.integration.android.IntentResult

class BarcodeScanActivity : AppCompatActivity() {
    var textBarcodeInfo: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barcode_scan)

        textBarcodeInfo = findViewById(R.id.text_barcode_info)

        IntentIntegrator(this).initiateScan()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        val result: IntentResult? =
            IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
        if (result != null) {
            if (result.contents == null) {
                Toast.makeText(this, "Cancelled", Toast.LENGTH_LONG).show()
            } else {
                textBarcodeInfo?.text =
                    ("contents : ${result.contents}\nformatName : ${result.formatName}\nbarcodeImagePath : ${result.barcodeImagePath}\nerrorCorrectionLevel : ${result.errorCorrectionLevel}")
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}