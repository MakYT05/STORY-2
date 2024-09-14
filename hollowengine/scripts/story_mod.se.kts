val team by server.players

val npc by NPCEntity.creating {
    name = "???"
    model = "mak:models/entity/classic.gltf"
    textures["char"] = "mak:textures/мак_программист.png"
    pos = pos(-65, 64, 130)

    showName = false
}

npc lookAlwaysAt team

npc.hitboxMode = HitboxMode.BLOCKING

npc.invulnerable = true

team.tpTo {
    pos = pos(58, 78, 2)
}

team.waitPos {
    pos = pos(28, 62, 1)
    radius = 2.0
    ignoreY = true
    createIcon = false
}

wait {2.sec}
npc say {"Здравствуйте!"}
wait {2.sec}
npc say {"Ох... вы задаётесь вопросом кто я?"}
wait {2.sec}
npc say {"Хах..."}
wait {2.sec}

npc.name = "БОГ"

npc say {"Я - БОГ ЭТОГО МИРА!!!"}
wait {2.sec}
npc say {"И вы тут появились не просто так."}
wait {2.sec}
npc say {"Вы должны добыть все мои божественные инструменты!"}
wait {2.sec}
npc say {"Но к счастью для вас я раздобыл один сам..."}
wait {2.sec}
npc say {"МЕЧ!!!"}
wait {2.sec}
npc say {"Но перед тем как его вам отдать..."}
wait {2.sec}
npc say {"Принесите мне хотя бы 10 плоти зомби!"}
wait {2.sec}
npc say {"УДАЧИ!!!"}
wait {2.sec}

npc tpTo{
    pos = pos(4, 65, 3)
}

execute{"/time set night"}
execute{"/summon minecraft:zombie 8 64 1"}
execute{"/summon minecraft:zombie 8 64 1"}
execute{"/summon minecraft:zombie 8 64 1"}
execute{"/summon minecraft:zombie 8 64 1"}
execute{"/summon minecraft:zombie 8 64 1"}
execute{"/summon minecraft:zombie 8 64 1"}
execute{"/summon minecraft:zombie 8 64 1"}
execute{"/summon minecraft:zombie 8 64 1"}
execute{"/summon minecraft:zombie 8 64 1"}
execute{"/summon minecraft:zombie 8 64 1"}

npc.requestItems{
    +item("minecraft:rotten_flesh", 10)
}

execute{"/time set day"}

npc say {"Вы..."}
wait {2.sec}
npc say {"Уже..."}
wait {2.sec}
npc say {"Справились..."}
wait {2.sec}
npc say {"Ургх..."}
wait {2.sec}
npc say {"Неинтерестно с вами однако!"}
wait {2.sec}
npc say {"Ладно, вот ваш меч."}
wait {2.sec}

execute{"/give @a fire_items:fire_sword"}

npc say {"А теперь прыгайте в глотку статуи."}

team.waitPos {
    pos = pos(-6, 37, 1)
    radius = 1.0
    ignoreY = true
    createIcon = false
}

execute{"/tp @a -57 64 122"}

npc tpTo{
    pos = pos(-66, 64, 130)
}

npc say {"Отлично!"}
wait {2.sec}
npc say {"А теперь слушайте внимательно!!!"}
wait {2.sec}
npc say {"Перед вами портал в ад..."}
wait {2.sec}
npc say {"Вам придётся в него зайти..."}
wait {2.sec}
npc say {"Ибо только в аду вы сможете добыть божественную руду 'Огниум'!"}
wait {2.sec}
npc say {"Дам вам подсказку:"}
wait {2.sec}
npc say {"Для кирки, топора, лопаты и мотыги для крафта используются огниум и палки нефритов."}
wait {2.sec}
npc say {"Крафтятся они аналогично другим инструментам."}
wait {2.sec}
npc say {"Огниум вы сможите найти в сундуках, находящиеся в крепостях!"}
wait {2.sec}
npc say {"Ну что вы так на меня смотрите?"}
wait {2.sec}
npc say {"Я же не могу вас отправить в опасное место только лишь с мечом."}
wait {2.sec}
npc say {"Вот вам железные сеты, железные кирки, верстак и 10 яблок."}
wait {2.sec}

execute{"/give @a minecraft:iron_helmet"}
execute{"/give @a minecraft:iron_chestplate"}
execute{"/give @a minecraft:iron_leggings"}
execute{"/give @a minecraft:iron_boots"}
execute{"/give @a minecraft:apple 10"}
execute{"/give @a minecraft:iron_pickaxe"}
execute{"/give @a minecraft:crafting_table"}

npc say {"Думаю вам этого хватит."}
wait {2.sec}
npc say {"Ну а теперь в путь."}
wait {2.sec}
npc say {"УДАЧИ!!!"}

team.waitPos {
    world = "minecraft:the_nether"
    pos = pos(-11, 76, 22)
    radius = 1.0
    ignoreY = true
    createIcon = true
}

npc say {"Вы вошли в ад."}
wait {2.sec}
npc say {"Это место кишит нежитью."}
wait {2.sec}
npc say {"Будьте осторожны!!!"}
wait {2.sec}
npc say {"И ещё..."}
wait {2.sec}
npc say {"Вернуться ко мне вы сможете только через портал из которого только что вышли."}
wait {2.sec}
npc say {"Если выйдете через другой..."}
wait {2.sec}
npc say {"Вы тупо потеряетесь, и я не смогу вас найти в моём бесскрайнем мире!"}
wait {2.sec}
npc say {"УДАЧИ!!!"}

team.waitPos {
    world = "minecraft:the_nether"
    pos = pos(-10, 76, 22)
    radius = 0.5
    ignoreY = true
    createIcon = true
}

npc say {"ЗАХОДИТЕ В ПОРТАЛ!!!"}

team.waitPos {
    pos = pos(-82, 65, 130)
    radius = 1.0
    ignoreY = true
    createIcon = false
}

execute{"/tp @a -190 78 25"}

npc tpTo{
    pos = pos(-200, 80, 25)
}

npc say {"О..."}
wait {2.sec}
npc say {"Вы вернулись!!!"}
wait {2.sec}
npc say {"Ну что, принесли мои божественные предметы?"}

npc.requestItems{
    +item("minecraft:rotten_flesh", 4)
}

npc say {"УРА!!!"}
wait {2.sec}
npc say {"Вы сделали это!"}
wait {2.sec}
npc say {"Отныне и навсегда вы ЛЕГЕНДЫ этого мира!"}
wait {2.sec}
npc say {"А..."}
wait {2.sec}
npc say {"И ещё..."}
wait {2.sec}
npc say {"Вот вам божественный коктейль!!!"}

execute{"give @a fire_items:fire_flesh"}
