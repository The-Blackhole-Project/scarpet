__config() -> {'scope'->'global','stay_loaded'->true};

__on_player_connects(player)->(
    print(format(['f [', 'l +', 'f ] ', Player()]))
);
__on_player_disconnects(player, reason)->(
    print(format(['f [', 'r -', 'f ] ', Player()]))
);
