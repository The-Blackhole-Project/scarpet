__config()-> {
    'stay_loaded' -> true,
    'scope' -> 'global',
    'commands' -> {
        'on' -> _() -> (
            team_add('liveStatus', player());
            return(print(player(), format(['f [', 'y m', 't a', 'd i', 'g SMP', 'f ]', 'w  Modalitá live attiva.'])));
        ),
        'off' -> _() -> (
            team_leave(player());
            return(print(player(), format(['f [', 'y m', 't a', 'd i', 'g SMP', 'f ]', 'w  Modalitá live disattivata.'])));
        )
    };

};
team_add('noTag');
team_property('noTag', 'nametagVisibility', 'never');
if(team_list('liveStatus'),
    team_property('liveStatus', 'nametagVisibility', 'never');
);

__on_close()->(
    team_remove('noTag');
    if(team_list('liveStatus'),
        team_property('liveStatus', 'nametagVisibility', 'always');
    );
)
