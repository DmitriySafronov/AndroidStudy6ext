package pw.cyberbrain.androidstudy6ext;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ThirdActivity extends AppCompatActivity {

    public class Person {
        String mName;
        String mPhone;
        int mPicture;

        Person(String mN, String mPh, int mPi) {
            this.mName = mN;
            this.mPhone = mPh;
            this.mPicture = mPi;
        }
    }

    public class MyAdapter extends BaseAdapter {
        // Утащено из интернетов и частично даже понято :)

        ArrayList<Person> data = new ArrayList<Person>();
        Context context;

        MyAdapter(Context context, ArrayList<Person> arr) {
            if (arr != null) {
                data = arr;
            }
            this.context = context;
        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return data.size();
        }

        @Override
        public Object getItem(int num) {
            // TODO Auto-generated method stub
            return data.get(num);
        }

        @Override
        public long getItemId(int arg0) {
            // TODO Auto-generated method stub
            return arg0;
        }

        @Override
        public View getView(int i, View mSomeView, ViewGroup mViewGroup) {
            // Получение объекта mInflater из контекста
            LayoutInflater mInflater = LayoutInflater.from(context);
            // Если mSomeView (View из ListView) вдруг оказался равен null тогда мы загружаем его с помошью mInflater
            if (mSomeView == null) {
                mSomeView = mInflater.inflate(R.layout.contact_item, mViewGroup, false);
            }
            //Обявляем наши текствьюшки и имейжвьюху и связываем их с разметкой
            TextView mContactName = (TextView) mSomeView.findViewById(R.id.contactName);
            TextView mContactPhone = (TextView) mSomeView.findViewById(R.id.contactPhone);
            ImageView mContactPicture = (ImageView) mSomeView.findViewById(R.id.contactPicture);

            //Устанавливаем в каждую текствьюшку соответствующий текст
            // сначала заголовок
            mContactName.setText(data.get(i).mName);
            // потом подзаголовок
            mContactPhone.setText(data.get(i).mPhone);

            // Втыкаем картинку
            mContactPicture.setImageResource(data.get(i).mPicture);

            return mSomeView;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        ListView mPseudoContacts = findViewById(R.id.pseudoContacts);
        ArrayList<Person> mData = new ArrayList<Person>();

        mData.add(new Person("Иванов", "111111111", R.drawable.ic_launcher_foreground));
        mData.add(new Person("Петров", "222222222", R.drawable.ic_launcher_background));
        mData.add(new Person("Сидоров", "333333333", R.drawable.vkontakte));
        mData.add(new Person("Кощей", "444444444", R.drawable.facebook));
        mData.add(new Person("Горыныч", "555555555", R.drawable.googleplus));
        mData.add(new Person("Иванов", "111111111", R.drawable.ic_launcher_foreground));
        mData.add(new Person("Петров", "222222222", R.drawable.ic_launcher_background));
        mData.add(new Person("Сидоров", "333333333", R.drawable.vkontakte));
        mData.add(new Person("Кощей", "444444444", R.drawable.facebook));
        mData.add(new Person("Горыныч", "555555555", R.drawable.googleplus));
        mData.add(new Person("Иванов", "111111111", R.drawable.ic_launcher_foreground));
        mData.add(new Person("Петров", "222222222", R.drawable.ic_launcher_background));
        mData.add(new Person("Сидоров", "333333333", R.drawable.vkontakte));
        mData.add(new Person("Кощей", "444444444", R.drawable.facebook));
        mData.add(new Person("Горыныч", "555555555", R.drawable.googleplus));
        mData.add(new Person("Иванов", "111111111", R.drawable.ic_launcher_foreground));
        mData.add(new Person("Петров", "222222222", R.drawable.ic_launcher_background));
        mData.add(new Person("Сидоров", "333333333", R.drawable.vkontakte));
        mData.add(new Person("Кощей", "444444444", R.drawable.facebook));
        mData.add(new Person("Горыныч", "555555555", R.drawable.googleplus));
        mData.add(new Person("Иванов", "111111111", R.drawable.ic_launcher_foreground));
        mData.add(new Person("Петров", "222222222", R.drawable.ic_launcher_background));
        mData.add(new Person("Сидоров", "333333333", R.drawable.vkontakte));
        mData.add(new Person("Кощей", "444444444", R.drawable.facebook));
        mData.add(new Person("Горыныч", "555555555", R.drawable.googleplus));
        mData.add(new Person("Иванов", "111111111", R.drawable.ic_launcher_foreground));
        mData.add(new Person("Петров", "222222222", R.drawable.ic_launcher_background));
        mData.add(new Person("Сидоров", "333333333", R.drawable.vkontakte));
        mData.add(new Person("Кощей", "444444444", R.drawable.facebook));
        mData.add(new Person("Горыныч", "555555555", R.drawable.googleplus));

        mPseudoContacts.setAdapter(new MyAdapter(this, mData));
    }
}
