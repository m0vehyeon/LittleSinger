package com.example.sing;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DB_Open extends SQLiteOpenHelper {


    public DB_Open(@Nullable Context context) {
        super(context, "sing105", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS sing4 (id INT, name TEXT, lyrics TEXT, uri TEXT );");
        db.execSQL("CREATE TABLE IF NOT EXISTS singeng (id INT, name TEXT, lyrics TEXT, uri TEXT );");
        db.execSQL("CREATE TABLE IF NOT EXISTS score1 (name TEXT, score TEXT ,date TEXT);");

        db.execSQL("INSERT INTO sing4 (id,name,lyrics,uri) Values (1,'곰세마리','곰 세 마리가 한 집에 있어 아빠곰 엄마곰 애기곰 아빠곰은 뚱뚱해 엄마곰은 날씬해 애기곰은 너무 귀여워 히쭉히쭉 잘한다곰 세 마리가 한 집에 있어 아빠곰 엄마곰 애기곰 아빠곰은 뚱뚱해 엄마곰은 날씬해 애기곰은 너무 귀여워 히쭉히쭉 잘한다 히쭉히쭉 잘한다','android.resource://com.example.sing/raw/a')");
        db.execSQL("INSERT INTO sing4 (id,name,lyrics,uri) Values (2,'엄마돼지 아기돼지','토실토실 아기 돼지 젖 달라고 꿀꿀꿀 엄마 돼지 오냐 오냐 알았다고 꿀꿀꿀 꿀꿀 꿀꿀 꿀꿀 꿀꿀 꿀꿀꿀꿀 꿀꿀꿀꿀 꿀꿀꿀꿀 꿀 아기 돼지 바깥으로 나가자고 꿀꿀꿀 엄마 돼지 비가 와서  안 된다고 꿀꿀꿀  토실토실 아기 돼지 젖 달라고 꿀꿀꿀 엄마 돼지 오냐 오냐 알았다고 꿀꿀꿀 꿀꿀 꿀꿀 꿀꿀 꿀꿀 꿀꿀꿀꿀 꿀꿀꿀꿀 꿀꿀꿀꿀 꿀 아기 돼지 바깥으로 나가자고 꿀꿀꿀 엄마 돼지 비가 와서  안 된다고 꿀꿀꿀  토실토실 아기 돼지 젖 달라고 꿀꿀꿀 엄마 돼지 오냐 오냐 알았다고 꿀꿀꿀 꿀꿀 꿀꿀 꿀꿀 꿀꿀 꿀꿀꿀꿀 꿀꿀꿀꿀 꿀꿀꿀꿀 꿀 아기 돼지 바깥으로 나가자고 꿀꿀꿀 엄마 돼지 비가 와서  안 된다고 꿀꿀꿀  토실토실 아기 돼지 젖 달라고 꿀꿀꿀 엄마 돼지 오냐 오냐 알았다고 꿀꿀꿀 꿀꿀 꿀꿀 꿀꿀 꿀꿀 꿀꿀꿀꿀 꿀꿀꿀꿀 꿀꿀꿀꿀 꿀 아기 돼지 바깥으로 나가자고 꿀꿀꿀 엄마 돼지 비가 와서  안 된다고 꿀꿀꿀  ','android.resource://com.example.sing/raw/b')");
        db.execSQL("INSERT INTO sing4 (id,name,lyrics,uri) Values (3,'여름 냇가','시냇물은 졸졸졸졸 고기들은 왔다 갔다 버들 가지 한들한들 꾀꼬리는 꾀꼴꾀꼴 금빛 옷을 차려 입고 여름 아씨 마중 왔다 곱게 곱게 차려 입고  시냇가에 빨래 왔다  ','android.resource://com.example.sing/raw/c')");
        db.execSQL("INSERT INTO sing4 (id,name,lyrics,uri) Values (4,'코끼리 아저씨','코끼리 아저씨는 코가 손이래 과자를 주면은 코로 받지요 코끼리 아저씨는 소방수래요 불나면 빨리 와 모셔가지요 ','android.resource://com.example.sing/raw/d')");
        db.execSQL("INSERT INTO sing4 (id,name,lyrics,uri) Values (5,'작은 동물원','삐약삐약 병아리 음매음매 송아지 따당따당 사냥꾼 뒤뚱뒤뚱 물오리 푸 푸 개구리 집게집게집게 가재 푸르르르 물풀 따당당당당 소라 삐약삐약 병아리 음매음매 송아지 따당따당 사냥꾼 뒤뚱뒤뚱 물오리 푸 푸 개구리 집게집게집게 가재 푸르르르 물풀 따당당당당 소라','android.resource://com.example.sing/raw/e')");
        db.execSQL("INSERT INTO sing4 (id,name,lyrics,uri) Values (6,'개구리','개굴개굴 개구리 노래를 한다 아들 손자 며느리 다 모여서 밤새도록 하여도 듣는이 없네 듣는 사람 없어도 날이 밝도록 개굴개굴개구리 노래를한다 개굴개굴 개구리 목청도 좋다개굴개굴 개구리 노래를 한다 아들 손자 며느리 다 모여서 밤새도록 하여도 듣는이 없네 듣는사람 없어도 날이 밝도록 개굴개굴개구리 노래를한다 개굴개굴개구리 목청도 좋다','android.resource://com.example.sing/raw/f')");
        /*db.execSQL("INSERT INTO sing4 (id,name,lyrics,uri) Values (7,'나무를 심자','산 하고 하늘 하고 누가 누가 더 푸른가 산 하고 하늘 하고 누가 누가 더 푸른가 내기 해봐라 내기 해봐라 나무를 심어줄게 나무를 심어줄게 산아 산아 이겨라 좀 더 파래라 욜로레이 욜로레이 욜로레이리 욜로레이 욜로레이 욜로레이 욜로레이리 욜로레이  들 하고 바다 하고 누가 누가 더 푸른가 들 하고 하늘 하고 누가 누가 더 푸른가  내기해봐라 내기해봐라 나무를 심어줄게 나무를 심어줄게  산아 산아 이겨라 좀 더 파 래라 욜로레이 욜로레이 욜로레이리 욜로레이 욜로레이 욜로레이 욜로레이리 욜로레이','android.resource://com.example.sing/raw/g')");
        db.execSQL("INSERT INTO sing4 (id,name,lyrics,uri) Values (8,'내가 먼저 가야해요','하얀 자동차가 삐뽀삐뽀 내가 먼저 가야해요 삐뽀삐뽀 아픈사람 탔으니까 삐뽀삐뽀 병원으로 가야해요 삐뽀삐뽀 빨간 소방차가 애앵애앵 내가먼저 가야해요 애앵애앵 불났어요 불났어요 애앵애앵 불을 끄러 가야해요 앵앵앵앵앵','android.resource://com.example.sing/raw/h')");
        db.execSQL("INSERT INTO sing4 (id,name,lyrics,uri) Values (9,'악어 떼','정글 숲을 지나서 가자 엉금엉금 기어서 가자 늪지대가 나타나면은 악어떼가 나올라 악어떼 정글숲을 지나서 가자 엉금엉금 기어서 가자 늪지대가 나타나면은 악어떼가 나올라 악어떼','android.resource://com.example.sing/raw/i')");
        db.execSQL("INSERT INTO sing4 (id,name,lyrics,uri) Values (10,'올챙이와 개구리','개울가에 올챙이 한 마리 꼬물꼬물 헤엄치다 뒷다리가 쑥 앞다리가 쑥 팔딱팔딱 개구리 됐네 꼬물꼬물 꼬물꼬물 꼬물꼬물 올챙이가 뒷다리가 쑥 앞다리가 쑥 팔딱팔딱 개구리 됐네 개울가에 올챙이 한 마리 꼬물꼬물 헤엄치다 뒷다리가 쑥 앞다리가 쑥 팔딱팔딱 개구리 됐네 꼬물꼬물 꼬물꼬물 꼬물꼬물 올챙이가 뒷다리가 쑥 앞다리가 쑥 팔딱팔딱 개구리 됐네','android.resource://com.example.sing/raw/j')");*/

        db.execSQL("INSERT INTO singeng (id,name,lyrics,uri) Values (1,'Finger Family','daddy finger daddy finger where are you here i am here i am how do you do mommy finger mommy finger where are you here i am here i am how do you do brother finger brother finger where are you here i am here i am how do you do sister finger sister finger where are you here i am here i am how do you do baby finger baby finger where are you here i am here i am how do you do','android.resource://com.example.sing/raw/a1')");
        db.execSQL("INSERT INTO singeng (id,name,lyrics,uri) Values (2,'The Three Bear','three bears living in one house daddy bear mommy bear baby bear daddy bear is fat fat fat mommy bear is skinny baby bear is so much cute smile smile there you go three bears living in one house in one house daddy bear mommy bear baby bear daddy bear is fat fat fat mommy bear is skinny baby bear is so much cute smile smile there you go','android.resource://com.example.sing/raw/b1')");
        db.execSQL("INSERT INTO singeng (id,name,lyrics,uri) Values (3,'Head and Shoulders Knees and Toes','head and shoulders knees and toes knees and toes head and shoulders knees and toes knees and toes eyes and ears and mouth and nose head and shoulders knees and toes knees and toes head and shoulders knees and toes knees and toes head and shoulders knees and toes knees and toes eyes and ears and mouth and nose head and shoulders knees and toes knees and toes','android.resource://com.example.sing/raw/c1')");
        db.execSQL("INSERT INTO singeng (id,name,lyrics,uri) Values (4,'How Are You My Friend','how are you my friend how are you today will you please come in tra la la la la la how are you my friend how are you today will you please sit down tra la la la la la ','android.resource://com.example.sing/raw/d1')");
        /*db.execSQL("INSERT INTO singeng (id,name,lyrics,uri) Values (5,'If You are Happy','if you are happy and you know it clap your hands if you are happy and you know it clap your hands if you are happy and you know it and you really want to show it if you are happy and you know it clap your hands if you are happy and you know it stamp your feet if you are happy and you know it stamp your feet if you are happy and you know it and you really want to show it if you are happy and you know it stamp your feet if you are happy and you know it nod your head if you are happy and you know it nod your head if you are happy and you know it and you really want to show it if you are happy and you know it nod your head if you are happy and you know it shout hurray if you are happy and you know it shout hurrary if you are happy and you know it and you really want to show it if you are happy and you know it shout hurray', 'android.resource://com.example.sing/raw/e1')");
        db.execSQL("INSERT INTO singeng (id,name,lyrics,uri) Values (6,'Jingle Bell','jingle bells jingle bells jingle all the way o what fun it is to ride in a one horse open sleigh jingle bells jingle bells jingle all the way o what fun it is to ride in a one horse open sleigh dashing through the snow in a one horse open sleight over fields we go laughing all the way bells on bob-tails ring making spirits bright what fun it is to laugh and sing a sleighing song tonight jingle bells jingle bells jingle all the way o what fun it is to ride in a one horse open sleigh jingle bells jingle bells jingle all the way o what fun it is to ride in a one horse open sleigh o what fun it is to ride in a one horse open sleigh a day or two ago i thought i would take a ride and soon miss fanny bright was seated by my side the horse was lean and lank misfortune seemed his lot he slipped upon a drifted bank and then we got upsot jingle bells jingle bells jingle all the way o what fun it is to ride in a one horse open sleigh jingle bell jingle bells jingle all the way o what fun it is to ride in a one horse open sleigh','android.resource://com.example.sing/raw/f1')");
        db.execSQL("INSERT INTO singeng (id,name,lyrics,uri) Values (7,'Rain, Rain, Go Away','rain rain go away come again another day little johnny wants to play rain rain go to spain rain rain go away come again another day little baby wants to play rain rain go away rain rain go away come again another day little johnny wants to play rain rain go to spain rain rain go away come again another day little baby wants to play rain rain go away rain rain go away come again another day little johnny wants to play rain rain go to spain rain rain go away come again another day little baby wants to play rain rain go away ','android.resource://com.example.sing/raw/h1')");
        db.execSQL("INSERT INTO singeng (id,name,lyrics,uri) Values (8,'Santa Claus is Coming to Town','you would better watch out you would better not cry better not pout i am you why santa claus is coming to town he is making a list and checking it twice gonna find out who is naughty or nice santa clause is coming to town he sees you when you are sleeping he knows when you are awak he knows if you have been bad or good so be good for goodness sake oh you would better watch out you would better not cry better not pout i am telling you why santa claus is coming to town he is making a list and checking it twice gonna find out who is naughty or nice santa claus is coming to town he sees you when you are sleeping he knows when you are awake he knows if you have been bad or good so be good for goodness sake oh you would better watch out you would better not cry better not pout i am telling you why santa claus is coming to town santa claus is coming to town','android.resource://com.example.sing/raw/i1')");
*/
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS sing4");
        db.execSQL("DROP TABLE IF EXISTS singeng");
        db.execSQL("DROP TABLE IF EXISTS score1");

        onCreate(db);
    }
}