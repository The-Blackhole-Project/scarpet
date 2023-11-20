__config() -> {'scope'->'global','stay_loaded'->true};

__on_player_connects(player)->(
    run(str('tellraw @a ["",{"text":"[","color":"dark_gray"},{"text":"+","color":"green"},{"text":"] ","color":"dark_gray"},', player, ']'));
);
__on_player_disconnects(player, reason)->(
    run(str('tellraw @a ["",{"text":"[","color":"dark_gray"},{"text":"-","color":"red"},{"text":"] ","color":"dark_gray"},', player, ']'));
);
