__config()-> {'stay_loaded' -> true,'scope' -> 'global',};

__on_player_connects(player)->(
    if(team_list('noTag'),
        team_add('noTag', player);
    );
);

team_add('noTag');
team_property('noTag', 'nametagVisibility', 'never');
if(team_list('liveStatus'),
    team_property('liveStatus', 'nametagVisibility', 'never');
);
run('team join noTag @a')

__on_close()->(
    team_remove('noTag');
    if(team_list('liveStatus'),
        team_property('liveStatus', 'nametagVisibility', 'always');
    );
)
