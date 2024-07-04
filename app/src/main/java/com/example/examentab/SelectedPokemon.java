package com.example.examentab;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.example.examentab.Statics;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

public class SelectedPokemon extends AppCompatActivity {

    ImageButton btn_ret;


    ConstraintLayout Main;
    ImageView pokemon;
    TextView name;
    TextView id;
    ImageView class1;
    ImageView class2;
    TextView about;
    TextView weight;
    TextView height;
    TextView ability1;
    TextView ability2;
    TextView description;
    TextView basecolor;
    TextView hp_color;
    TextView hp_stat;
    ImageView hp_bar;
    TextView atk_color;
    TextView atk_stat;
    ImageView atk_bar;
    TextView def_color;
    TextView def_stat;
    ImageView def_bar;
    TextView satk_color;
    TextView satk_stat;
    ImageView satk_bar;
    TextView sdef_color;
    TextView sdef_stat;
    ImageView sdef_bar;
    TextView spd_color;
    TextView spd_stat;
    ImageView spd_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_selected_pokemon);

        btn_ret = findViewById(R.id.btn_back);

        Main = findViewById(R.id.main);
        pokemon = findViewById(R.id.pokemon);
        name = findViewById(R.id.poke_name);
        id = findViewById(R.id.poke_id);
        class1 = findViewById(R.id.class1);
        class2 = findViewById(R.id.class2);
        about = findViewById(R.id.about_color);
        weight = findViewById(R.id.text_weight);
        height = findViewById(R.id.text_height);
        ability1 = findViewById(R.id.ability1);
        ability2 = findViewById(R.id.ability2);
        description = findViewById(R.id.desc);
        basecolor = findViewById(R.id.base_stats);
        hp_color = findViewById(R.id.hp_color);
        hp_stat = findViewById(R.id.hp_stat);
        hp_bar = findViewById(R.id.hp_bar);
        atk_color = findViewById(R.id.atk_color);
        atk_stat = findViewById(R.id.atk_stat);
        atk_bar = findViewById(R.id.atk_bar);
        def_color = findViewById(R.id.def_color);
        def_stat  = findViewById(R.id.def_stat);
        def_bar = findViewById(R.id.def_bar);
        satk_color = findViewById(R.id.satk_color);
        satk_stat = findViewById(R.id.satk_stat);
        satk_bar = findViewById(R.id.satk_bar);
        sdef_color = findViewById(R.id.sdef_color);
        sdef_stat = findViewById(R.id.sdef_stat);
        sdef_bar = findViewById(R.id.sdef_bar);
        spd_color = findViewById(R.id.spd_color);
        spd_stat = findViewById(R.id.spd_stat);
        spd_bar = findViewById(R.id.spd_bar);


        PokemonInit(Statics._SelectedPokemon);

        btn_ret.setOnClickListener(new View.OnClickListener() { //возврат к списку покемонов
            @Override
            public void onClick(View v) {
                com.example.examentab.Statics._SelectedPokemon = "";
                Intent intent = new Intent(SelectedPokemon.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
    private void PokemonInit(String pokemonSource){ //данные подставляются в зависимости от выбраннго покемона
        switch (pokemonSource){
            case "Charmander":
                Main.setBackgroundColor(Color.parseColor("#F57D31"));
                pokemon.setImageResource(R.drawable.charmander);
                name.setText("Charmander");
                id.setText("#004");
                class1.setImageResource(R.drawable.type_fire);
                class2.setImageDrawable(null);
                about.setTextColor(Color.parseColor("#F57D31"));
                weight.setText("8,5 kg");
                height.setText("0,6 m");
                ability1.setText("Mega-Punch");
                ability2.setText("Fire-Punch");
                description.setText("It has a preference for hot things. When it rains, steam is said to spout from the tip of its tail.");
                basecolor.setTextColor(Color.parseColor("#F57D31"));
                hp_color.setTextColor(Color.parseColor("#F57D31"));
                atk_color.setTextColor(Color.parseColor("#F57D31"));
                def_color.setTextColor(Color.parseColor("#F57D31"));
                satk_color.setTextColor(Color.parseColor("#F57D31"));
                sdef_color.setTextColor(Color.parseColor("#F57D31"));
                spd_color.setTextColor(Color.parseColor("#F57D31"));
                hp_stat.setText("039");
                atk_stat.setText("052");
                def_stat.setText("043");
                satk_stat.setText("060");
                sdef_stat.setText("050");
                spd_stat.setText("065");
                hp_bar.setImageResource(R.drawable.char_hp);
                atk_bar.setImageResource(R.drawable.char_atk);
                def_bar.setImageResource(R.drawable.char_def);
                satk_bar.setImageResource(R.drawable.char_satk);
                sdef_bar.setImageResource(R.drawable.char_sdef);
                spd_bar.setImageResource(R.drawable.char_spd);
                break;
            case "Squirtle":
                Main.setBackgroundColor(Color.parseColor("#6493EB"));
                pokemon.setImageResource(R.drawable.squirtle);
                name.setText("Squirtle");
                id.setText("#007");
                class1.setImageResource(R.drawable.type_water);
                class2.setImageDrawable(null);
                about.setTextColor(Color.parseColor("#6493EB"));
                weight.setText("9,0 kg");
                height.setText("0,5 m");
                ability1.setText("Torrent");
                ability2.setText("Rain-Dish");
                description.setText("When it retracts its long neck into its shell, it squirts out water with vigorous force.");
                basecolor.setTextColor(Color.parseColor("#6493EB"));
                hp_color.setTextColor(Color.parseColor("#6493EB"));
                atk_color.setTextColor(Color.parseColor("#6493EB"));
                def_color.setTextColor(Color.parseColor("#6493EB"));
                satk_color.setTextColor(Color.parseColor("#6493EB"));
                sdef_color.setTextColor(Color.parseColor("#6493EB"));
                spd_color.setTextColor(Color.parseColor("#6493EB"));
                hp_stat.setText("044");
                atk_stat.setText("048");
                def_stat.setText("065");
                satk_stat.setText("050");
                sdef_stat.setText("064");
                spd_stat.setText("043");
                hp_bar.setImageResource(R.drawable.sqir_hp);
                atk_bar.setImageResource(R.drawable.squir_atk);
                def_bar.setImageResource(R.drawable.squir_def);
                satk_bar.setImageResource(R.drawable.squir_satk);
                sdef_bar.setImageResource(R.drawable.squir_sdef);
                spd_bar.setImageResource(R.drawable.squir_spd);
                break;

            case "Butterfree":
                Main.setBackgroundColor(Color.parseColor("#A7B723"));
                pokemon.setImageResource(R.drawable.butterfree);
                name.setText("Butterfree");
                id.setText("#012");
                class1.setImageResource(R.drawable.type_water);
                class2.setImageResource(R.drawable.type_flying);
                about.setTextColor(Color.parseColor("#A7B723"));
                weight.setText("32,0 kg");
                height.setText("1,1 m");
                ability1.setText("Compound-Eyes");
                ability2.setText("Tinted-Lens");
                description.setText("In battle, it flaps its wings at great speed to release highly toxic dust into the air.");
                basecolor.setTextColor(Color.parseColor("#A7B723"));
                hp_color.setTextColor(Color.parseColor("#A7B723"));
                atk_color.setTextColor(Color.parseColor("#A7B723"));
                def_color.setTextColor(Color.parseColor("#A7B723"));
                satk_color.setTextColor(Color.parseColor("#A7B723"));
                sdef_color.setTextColor(Color.parseColor("#A7B723"));
                spd_color.setTextColor(Color.parseColor("#A7B723"));
                hp_stat.setText("060");
                atk_stat.setText("045");
                def_stat.setText("050");
                satk_stat.setText("090");
                sdef_stat.setText("080");
                spd_stat.setText("070");
                hp_bar.setImageResource(R.drawable.but_hp);
                atk_bar.setImageResource(R.drawable.but_atk);
                def_bar.setImageResource(R.drawable.but_def);
                satk_bar.setImageResource(R.drawable.but_satk);
                sdef_bar.setImageResource(R.drawable.but_sdef);
                spd_bar.setImageResource(R.drawable.but_spd);
                break;

            case "Pikachu":
                Main.setBackgroundColor(Color.parseColor("#F9CF30"));
                pokemon.setImageResource(R.drawable.pikachu);
                name.setText("Pikachu");
                id.setText("#025");
                class1.setImageResource(R.drawable.type_electric);
                class2.setImageDrawable(null);
                about.setTextColor(Color.parseColor("#F9CF30"));
                weight.setText("6,0 kg");
                height.setText("0,4 m");
                ability1.setText("Mega-Punch");
                ability2.setText("Pay-Day");
                description.setText("Pikachu that can generate powerful electricity have cheek sacs that are extra soft and super stretchy.");
                basecolor.setTextColor(Color.parseColor("#F9CF30"));
                hp_color.setTextColor(Color.parseColor("#F9CF30"));
                atk_color.setTextColor(Color.parseColor("#F9CF30"));
                def_color.setTextColor(Color.parseColor("#F9CF30"));
                satk_color.setTextColor(Color.parseColor("#F9CF30"));
                sdef_color.setTextColor(Color.parseColor("#F9CF30"));
                spd_color.setTextColor(Color.parseColor("#F9CF30"));
                hp_stat.setText("035");
                atk_stat.setText("055");
                def_stat.setText("040");
                satk_stat.setText("050");
                sdef_stat.setText("050");
                spd_stat.setText("090");
                hp_bar.setImageResource(R.drawable.pika_hp);
                atk_bar.setImageResource(R.drawable.pika_atk);
                def_bar.setImageResource(R.drawable.pika_def);
                satk_bar.setImageResource(R.drawable.pika_satk);
                sdef_bar.setImageResource(R.drawable.pika_sdef);
                spd_bar.setImageResource(R.drawable.pika_spd);
                break;

            case "Gastly":
                Main.setBackgroundColor(Color.parseColor("#70559B"));
                pokemon.setImageResource(R.drawable.gastly);
                name.setText("Gastly");
                id.setText("#092");
                class1.setImageResource(R.drawable.type_ghost);
                class2.setImageResource(R.drawable.type_poison);
                about.setTextColor(Color.parseColor("#70559B"));
                weight.setText("0,1 kg");
                height.setText("1,3 m");
                ability1.setText("Levitate");
                ability2.setVisibility(View.INVISIBLE);
                description.setText("Born from gases, anyone would faint if engulfed by its gaseous body, which contains poison.");
                basecolor.setTextColor(Color.parseColor("#70559B"));
                hp_color.setTextColor(Color.parseColor("#70559B"));
                atk_color.setTextColor(Color.parseColor("#70559B"));
                def_color.setTextColor(Color.parseColor("#70559B"));
                satk_color.setTextColor(Color.parseColor("#70559B"));
                sdef_color.setTextColor(Color.parseColor("#70559B"));
                spd_color.setTextColor(Color.parseColor("#70559B"));
                hp_stat.setText("030");
                atk_stat.setText("035");
                def_stat.setText("030");
                satk_stat.setText("100");
                sdef_stat.setText("035");
                spd_stat.setText("080");
                hp_bar.setImageResource(R.drawable.gas_hp);
                atk_bar.setImageResource(R.drawable.gas_atk);
                def_bar.setImageResource(R.drawable.gas_def);
                satk_bar.setImageResource(R.drawable.gas_satk);
                sdef_bar.setImageResource(R.drawable.gas_sdef);
                spd_bar.setImageResource(R.drawable.gas_spd);
                break;

            case "Ditto":
                Main.setBackgroundColor(Color.parseColor("#AAA67F"));
                pokemon.setImageResource(R.drawable.ditto);
                name.setText("Ditto");
                id.setText("#132");
                class1.setImageResource(R.drawable.type_normal);
                class2.setImageDrawable(null);
                about.setTextColor(Color.parseColor("#AAA67F"));
                weight.setText("4,0 kg");
                height.setText("0,3 m");
                ability1.setText("Limber");
                ability2.setText("Imposter");
                description.setText("It can reconstitute its entire cellular structure to change into what it sees, but it returns to normal when it relaxes.");
                basecolor.setTextColor(Color.parseColor("#AAA67F"));
                hp_color.setTextColor(Color.parseColor("#AAA67F"));
                atk_color.setTextColor(Color.parseColor("#AAA67F"));
                def_color.setTextColor(Color.parseColor("#AAA67F"));
                satk_color.setTextColor(Color.parseColor("#AAA67F"));
                sdef_color.setTextColor(Color.parseColor("#AAA67F"));
                spd_color.setTextColor(Color.parseColor("#AAA67F"));
                hp_stat.setText("048");
                atk_stat.setText("048");
                def_stat.setText("048");
                satk_stat.setText("048");
                sdef_stat.setText("048");
                spd_stat.setText("048");
                hp_bar.setImageResource(R.drawable.dit_hp);
                atk_bar.setImageResource(R.drawable.dit_atk);
                def_bar.setImageResource(R.drawable.dit_def);
                satk_bar.setImageResource(R.drawable.dit_satk);
                sdef_bar.setImageResource(R.drawable.dit_sdef);
                spd_bar.setImageResource(R.drawable.dit_spd);
                break;

            case "Mew":
                Main.setBackgroundColor(Color.parseColor("#FB5584"));
                pokemon.setImageResource(R.drawable.mew);
                name.setText("Mew");
                id.setText("#152");
                class1.setImageResource(R.drawable.type_physic);
                class2.setImageDrawable(null);
                about.setTextColor(Color.parseColor("#FB5584"));
                weight.setText("4,0 kg");
                height.setText("0,4 m");
                ability1.setText("Syncronize");
                ability2.setVisibility(View.VISIBLE);
                description.setText("When viewed through a microscope, this Pokémon’s short, fine, delicate hair can be seen.");
                basecolor.setTextColor(Color.parseColor("#FB5584"));
                hp_color.setTextColor(Color.parseColor("#FB5584"));
                atk_color.setTextColor(Color.parseColor("#FB5584"));
                def_color.setTextColor(Color.parseColor("#FB5584"));
                satk_color.setTextColor(Color.parseColor("#FB5584"));
                sdef_color.setTextColor(Color.parseColor("#FB5584"));
                spd_color.setTextColor(Color.parseColor("#FB5584"));
                hp_stat.setText("100");
                atk_stat.setText("100");
                def_stat.setText("100");
                satk_stat.setText("100");
                sdef_stat.setText("100");
                spd_stat.setText("100");
                hp_bar.setImageResource(R.drawable.mew_hp);
                atk_bar.setImageResource(R.drawable.mew_atk);
                def_bar.setImageResource(R.drawable.mew_def);
                satk_bar.setImageResource(R.drawable.mew_satk);
                sdef_bar.setImageResource(R.drawable.mew_sdef);
                spd_bar.setImageResource(R.drawable.mew_spd);
                break;

            case "Aron":
                Main.setBackgroundColor(Color.parseColor("#B7B9D0"));
                pokemon.setImageResource(R.drawable.aron);
                name.setText("Aron");
                id.setText("#304");
                class1.setImageResource(R.drawable.type_steel);
                class2.setImageResource(R.drawable.type_rock);
                about.setTextColor(Color.parseColor("#B7B9D0"));
                weight.setText("60,0 kg");
                height.setText("0,4 m");
                ability1.setText("Sturdy");
                ability2.setText("Rock-Head");
                description.setText("It eats iron ore - and sometimes railroad tracks - to build up the steel armor that protects its body.");
                basecolor.setTextColor(Color.parseColor("#B7B9D0"));
                hp_color.setTextColor(Color.parseColor("#B7B9D0"));
                atk_color.setTextColor(Color.parseColor("#B7B9D0"));
                def_color.setTextColor(Color.parseColor("#B7B9D0"));
                satk_color.setTextColor(Color.parseColor("#B7B9D0"));
                sdef_color.setTextColor(Color.parseColor("#B7B9D0"));
                spd_color.setTextColor(Color.parseColor("#B7B9D0"));
                hp_stat.setText("050");
                atk_stat.setText("070");
                def_stat.setText("100");
                satk_stat.setText("040");
                sdef_stat.setText("040");
                spd_stat.setText("030");
                hp_bar.setImageResource(R.drawable.aron_hp);
                atk_bar.setImageResource(R.drawable.aron_atk);
                def_bar.setImageResource(R.drawable.aron_def);
                satk_bar.setImageResource(R.drawable.aron_satk);
                sdef_bar.setImageResource(R.drawable.aron_sdef);
                spd_bar.setImageResource(R.drawable.aron_spd);
                break;
        }
    }
}