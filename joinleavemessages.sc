__config() -> {'scope'->'global','stay_loaded'->true};

__on_player_connects(player)->(
    print(format(['f [', 'l +', 'f ] ', player]))
);
__on_player_disconnects(player, reason)->(
    print(format(['f [', 'r -', 'f ] ', player]))
);
