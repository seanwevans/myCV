package com.seanwevans.mycv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.net.Uri;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void call(View view) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "15163302517", null)));
    }

    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","Sean.W.Evans@gmail.com", null));
        intent.putExtra(Intent.EXTRA_SUBJECT, "You're Hired!");
        intent.putExtra(Intent.EXTRA_TEXT, "Congratulations!");
        startActivity(Intent.createChooser(intent, "Choose an Email client :"));
    }

    public void affiliations(View view) { startActivity(new Intent("com.seanwevans.mycv.Affiliations")); }
    public void awards(View view) { startActivity(new Intent("com.seanwevans.mycv.Awards")); }
    public void download(View view) { startActivity(new Intent("com.seanwevans.mycv.Download")); }
    public void education(View view) {startActivity(new Intent("com.seanwevans.mycv.Education"));}
    public void interests(View view) { startActivity(new Intent("com.seanwevans.mycv.Interests")); }
    public void references(View view) { startActivity(new Intent("com.seanwevans.mycv.References")); }
    public void skills(View view) { startActivity(new Intent("com.seanwevans.mycv.Skills")); }
    public void work(View view) { startActivity(new Intent("com.seanwevans.mycv.Work")); }
    public void custom(View view) { startActivity(new Intent("com.seanwevans.mycv.Custom")); }

    public static List<String> interleave(
            final List<String> list1,
            final List<String> list2
    ) {
        List<String> result
                = new ArrayList<String>(list1.size() + list2.size());

        Iterator<String> it1 = list1.iterator();
        Iterator<String> it2 = list2.iterator();
        while (it1.hasNext() || it2.hasNext()) {
            if (it1.hasNext()) {
                result.add(it1.next());
            }
            if (it2.hasNext()) {
                result.add(it2.next());
            }
        }
        return result;
    }
}
