package kr.ac.tabhosttest1_0509

import android.app.TabActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : TabActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tabHost = this.tabHost

        var tabSpec1 = tabHost.newTabSpec("first").setIndicator("첫번째탭")
        tabSpec1.setContent(R.id.cat)
        tabHost.addTab(tabSpec1)

        var tabSpec4 = tabHost.newTabSpec("fourth").setIndicator("네번째탭")
        tabSpec4.setContent(R.id.blackpanther)
        tabHost.addTab(tabSpec4)

        var tabSpec2 = tabHost.newTabSpec("second").setIndicator("두번째탭")
        tabSpec2.setContent(R.id.dog)
        tabHost.addTab(tabSpec2)

        var tabSpec3 = tabHost.newTabSpec("third").setIndicator("세번째탭")
        tabSpec3.setContent(R.id.blackpanther)
        tabHost.addTab(tabSpec3)

        tabHost.currentTab = 0
    }
}