package com.delate

val STATIONS = arrayOf(
    Station("Mammendorf", "MMAM", 8004204, 6160, arrayOf(3), 48.216684f, 11.174536f),
    Station("Malching", "MMAG", 8003828, 6150, arrayOf(3), 48.216088f, 11.219424f),
    Station("Maisach", "MMA", 8003824, 6140, arrayOf(3), 48.214688f, 11.256544f),
    Station("Gernlinden", "MGLD", 8002247, 6130, arrayOf(3), 48.213572f, 11.299526f),
    Station("Esting", "MESG", 8001996, 6120, arrayOf(3), 48.21298f, 11.319408f),
    Station("Olching", "MOL", 8004667, 6110, arrayOf(3), 48.210036f, 11.333912f),
    Station("Gröbenzell", "MGRZ", 8002377, 6100, arrayOf(3), 48.195232f, 11.37365f),
    Station("Lochhausen", "MLO", 8004153, 1810, arrayOf(3), 48.176292f, 11.407743f),
    Station("Langwied", "MLW", 8004152, 1800, arrayOf(3), 48.162945f, 11.43259f),
    Station("Pasing", "MP", 8004158, 10, arrayOf(3, 4, 6, 8, 20), 48.149124f, 11.460473f),
    Station("Laim", "ML", 8004151, 9, arrayOf(1, 2, 3, 4, 6, 8, 20), 48.143433f, 11.502985f),
    Station("Hirschgarten", "MMHG", 8004179, 31, arrayOf(1, 2, 3, 4, 6, 8, 20), 48.143544f, 11.519475f),
    Station("Donnersbergerbrücke", "MMDN", 8004128, 8, arrayOf(1, 2, 3, 4, 6, 7, 8), 48.14269f, 11.535229f),
    Station("Hackerbrücke", "MHAB", 8004129, 7, arrayOf(1, 2, 3, 4, 6, 7, 8), 48.143444f, 11.548529f),
    Station("Hauptbahnhof", "MHT", 8000261, 6, arrayOf(1, 2, 3, 4, 6, 7, 8), 48.14018f, 11.560868f),
    Station("Stachus", "MKA", 8004132, 7242, arrayOf(1, 2, 3, 4, 6, 7, 8), 48.416444f, 11.391664f),
    Station("Marienplatz", "MMP", 8004135, 2, arrayOf(1, 2, 3, 4, 6, 7, 8), 48.13727f, 11.575757f),
    Station("Isartor", "MIT", 8004131, 3, arrayOf(1, 2, 3, 4, 6, 7, 8), 48.134003f, 11.583205f),
    Station("Rosenheimer Platz", "MIT", 8004136, 4, arrayOf(1, 2, 3, 4, 6, 7, 8), 48.128587f, 11.593889f),
    Station("Ostbahnhof", "MOP", 8000262, 5, arrayOf(1, 2, 3, 4, 6, 7, 8), 48.128014f, 11.604003f),
    Station("St.-Martin-Str.", "MMAR", 8004138, 1100, arrayOf(3, 7), 48.11854f, 11.595822f),
    Station("Giesing", "MGI", 8004148, 1110, arrayOf(3, 7), 48.11071f, 11.594892f),
    Station("Fasangarten", "MFG", 8004146, 1120, arrayOf(3), 48.09216f, 11.606237f),
    Station("Fasanenpark", "MFP", 8001963, 2300, arrayOf(3), 48.079926f, 11.609372f),
    Station("Unterhaching", "MUH", 8005991, 2310, arrayOf(3), 48.064457f, 11.612392f),
    Station("Taufkirchen", "MTU", 8005831, 2320, arrayOf(3), 48.051617f, 11.609345f),
    Station("Furth", "MFU", 8002161, 2330, arrayOf(3), 48.034736f, 11.591674f),
    Station("Deisenhofen", "MDS", 8001404, 2340, arrayOf(3), 48.0202f, 11.58392f),
    Station("Sauerlach", "MSR", 8005299, 2350, arrayOf(3), 47.973864f, 11.654702f),
    Station("Otterfing", "MOTF", 8004726, 4360, arrayOf(3), 47.9106f, 11.682036f),
    Station("Holzkirchen", "MHO", 8002980, 4370, arrayOf(3), 47.884072f, 11.696692f),
    Station("Geltendorf", "MGE", 8000119, 5950, arrayOf(4), 48.106472f, 11.036488f),
    Station("Türkenfeld", "MTFD", 8005920, 6230, arrayOf(4), 48.104972f, 11.078276f),
    Station("Grafrath", "MGF", 8002351, 6220, arrayOf(4), 48.132364f, 11.152902f),
    Station("Schöngeising", "MSNG", 8005406, 6210, arrayOf(4), 48.146368f, 11.191522f),
    Station("Buchenau", "MBAU", 8001229, 6200, arrayOf(4), 48.161504f, 11.225414f),
    Station("Fürstenfeldbruck", "MFB", 8002141, 6190, arrayOf(4), 48.17226f, 11.262778f),
    Station("Eichenau", "MEIC", 8001702, 6180, arrayOf(4), 48.17916f, 11.328838f),
    Station("Puchheim", "MPM", 8004893, 6170, arrayOf(4), 48.172472f, 11.353034f),
    Station("Aubing", "MMAU", 8004141, 1710, arrayOf(4), 48.155952f, 11.413843f),
    Station("Leienfelsstr.", "MLEF", 8004133, 1700, arrayOf(4), 48.154564f, 11.428164f),
    Station("Herrsching", "MHI", 8002792, 5410, arrayOf(8), 47.998024f, 11.1709f),
    Station("Seefeld-Hechendorf", "MSH", 8005504, 5400, arrayOf(8), 48.040472f, 11.197162f),
    Station("Steinebach", "MSA", 8005699, 5390, arrayOf(8), 48.061548f, 11.20695f),
    Station("Weßling", "MWS", 8006359, 5380, arrayOf(8), 48.076776f, 11.25001f),
    Station("Neugilching", "MNGH", 8004249, 5370, arrayOf(8), 48.098012f, 11.288462f),
    Station("Gilching-Argelsried", "MGCH", 8002275, 5360, arrayOf(8), 48.106784f, 11.301004f),
    Station("Geisenbrunn", "MGIB", 8002210, 5350, arrayOf(8), 48.109088f, 11.326448f),
    Station("Germering-Unterpfaffenhofen", "MUG", 8006006, 6250, arrayOf(8), 48.12922f, 11.363948f),
    Station("Harthaus", "MHHS", 8002610, 6240, arrayOf(8), 48.133488f, 11.387836f),
    Station("Freiham", "MFH", 8004181, 1740, arrayOf(8), 48.138817f, 11.411498f),
    Station("Neuaubing", "MNA", 8004156, 1730, arrayOf(8), 48.142868f, 11.423509f),
    Station("Westkreuz", "MWKR", 8004163, 1720, arrayOf(6, 8), 48.149017f, 11.442496f),
    Station("Lochham", "MLCH", 8003720, 2580, arrayOf(6), 48.1285f, 11.433684f),
    Station("Gräfelfing", "MGFL", 8002339, 2590, arrayOf(6), 48.12028f, 11.425961f),
    Station("Planegg", "MPL", 8004827, 2600, arrayOf(6), 48.105267f, 11.413537f),
    Station("Stockdorf", "MSD", 8005735, 5420, arrayOf(6), 48.094052f, 11.401796f),
    Station("Gauting", "MGT", 8002198, 5430, arrayOf(6), 48.069968f, 11.376244f),
    Station("Starnberg Nord", "MSNO", 8005675, 5490, arrayOf(6), 48.005372f, 11.34798f),
    Station("Starnberg", "MST", 8005676, 5450, arrayOf(6), 47.996656f, 11.344914f),
    Station("Possenhofen", "MPH", 8004874, 5460, arrayOf(6), 47.962748f, 11.306228f),
    Station("Feldafing", "MFA", 8001970, 5470, arrayOf(6), 47.947092f, 11.290012f),
    Station("Tutzing", "MTZ", 8005927, 5480, arrayOf(6), 47.9072f, 11.273476f),
    Station("Moosach", "MMCH", 8004155, 300, arrayOf(1), 48.180454f, 11.506284f),
    Station("Fasanerie", "MFAS", 8004145, 310, arrayOf(1), 48.19716f, 11.524735f),
    Station("Feldmoching", "MFE", 8004147, 320, arrayOf(1), 48.213707f, 11.540671f),
    Station("Oberschleißheim", "MOSM", 8004580, 2000, arrayOf(1), 48.25806f, 11.557754f),
    Station("Unterschleißheim", "MUSM", 8006688, 2010, arrayOf(1), 48.273108f, 11.568226f),
    Station("Lohhof", "MLH", 8003735, 2020, arrayOf(1), 48.288456f, 11.581614f),
    Station("Eching", "MEC", 8001647, 2650, arrayOf(1), 48.303084f, 11.616904f),
    Station("Neufahrn", "MNF", 8004279, 2660, arrayOf(1), 48.32084f, 11.66077f),
    Station("Pulling", "MPU", 8004900, 2670, arrayOf(1), 48.363604f, 11.707316f),
    Station("Freising", "MFR", 8002078, 2680, arrayOf(1), 48.395428f, 11.744054f),
    Station("Flughafen Besucherpark", "MFHB", 8004167, 2860, arrayOf(1, 8), 48.352732f, 11.764074f),
    Station("Flughafen", "MFHM", 8004168, 2860, arrayOf(1, 8), 48.352732f, 11.764074f),
    Station("Hallbergmoos", "MHMO", 8002534, 2850, arrayOf(8), 48.308832f, 11.713978f),
    Station("Ismaning", "MIS", 8003092, 2040, arrayOf(8), 48.225924f, 11.679082f),
    Station("Unterföhring", "MUFG", 8005986, 2030, arrayOf(8), 48.19038f, 11.64703f),
    Station("Johanneskirchen", "MJK", 8004149, 720, arrayOf(8), 48.168335f, 11.646147f),
    Station("Englschalking", "MEGS", 8004144, 710, arrayOf(8), 48.156536f, 11.648308f),
    Station("Daglfing", "MDFG", 8004143, 700, arrayOf(8), 48.14915f, 11.649219f),
    Station("Leuchtenbergring", "MLEU", 8004134, 900, arrayOf(2, 4, 6, 8), 48.133926f, 11.616056f),
    Station("Berg am Laim", "MBAL", 8004142, 910, arrayOf(2, 4, 6), 48.134019f, 11.633129f),
    Station("Trudering", "MTR", 8004162, 920, arrayOf(4, 6), 48.12559f, 11.663328f),
    Station("Gronsdorf", "MGDF", 8002383, 2130, arrayOf(4, 6), 48.11834f, 11.698857f),
    Station("Haar", "MHR", 8002491, 2140, arrayOf(4, 6), 48.11144f, 11.731107f),
    Station("Vaterstetten", "MVS", 8006059, 4000, arrayOf(4, 6), 48.10454f, 11.765612f),
    Station("Baldham", "MBDH", 8000785, 4010, arrayOf(4, 6), 48.099204f, 11.786996f),
    Station("Zorneding", "MZO", 8006671, 4020, arrayOf(4, 6), 48.088892f, 11.832436f),
    Station("Eglharting", "MEGL", 8001682, 4030, arrayOf(4, 6), 48.08148f, 11.863934f),
    Station("Kirchseeon", "MKO", 8003290, 4040, arrayOf(4, 6), 48.071368f, 11.887766f),
    Station("Grafing Bahnhof", "MGB", 8002347, 4050, arrayOf(4, 6), 48.043744f, 11.94068f),
    Station("Grafing Stadt", "MGRS", 8002348, 4060, arrayOf(4, 6), 48.046856f, 11.961628f),
    Station("Ebersberg", "MEG", 8001634, 4070, arrayOf(4, 6), 48.075196f, 11.97006f),
    Station("Obermenzing", "MOZ", 8004157, 1900, arrayOf(2), 48.16419f, 11.4784f),
    Station("Untermenzing", "MAUG", 8004139, 1930, arrayOf(2), 48.177723f, 11.473803f),
    Station("Allach", "MMAL", 8004140, 1910, arrayOf(2), 48.19004f, 11.467004f),
    Station("Karlsfeld", "MKFS", 8004150, 1920, arrayOf(2), 48.21079f, 11.459726f),
    Station("Dachau", "MDA", 8001354, 6800, arrayOf(2), 48.254158f, 11.443205f),
    Station("Dachau Stadt", "MDAS", 8001355, 6850, arrayOf(2), 48.26664f, 11.440464f),
    Station("Bachern", "MBCN", 8000685, 6870, arrayOf(2), 48.280144f, 11.378354f),
    Station("Schwabhausen", "MSHH", 8005442, 6880, arrayOf(2), 48.301328f, 11.36459f),
    Station("Niederroth", "MNRO", 8004404, 6890, arrayOf(2), 48.321432f, 11.390258f),
    Station("Markt Indersdorf", "MIDR", 8003072, 6900, arrayOf(2), 48.352536f, 11.379538f),
    Station("Arnbach", "MANB", 8000603, 6910, arrayOf(2), 48.341416f, 11.344628f),
    Station("Erdweg", "MEWG", 8001829, 6920, arrayOf(2), 48.333848f, 11.302414f),
    Station("Kleinberghofen", "MKHN", 8003317, 6930, arrayOf(2), 48.354972f, 11.274316f),
    Station("Altomünster", "MAMT", 8000556, 6950, arrayOf(2), 48.38568f, 11.254222f),
    Station("Hebertshausen", "MHSN", 8006189, 6810, arrayOf(2), 48.290332f, 11.45433f),
    Station("Röhrmoos", "MRMS", 8005127, 6820, arrayOf(2), 48.331704f, 11.445676f),
    Station("Vierkirchen-Esterhofen", "MESH", 8001922, 6830, arrayOf(2), 48.361032f, 11.445574f),
    Station("Petershausen", "MPE", 8004775, 6840, arrayOf(2), 48.41262f, 11.469936f),
    Station("Heimeranplatz", "MHPW", 8005419, 1150, arrayOf(7, 20), 48.13306f, 11.532673f),
    Station("Harras", "MHAR", 8004130, 1130, arrayOf(7, 20), 48.116894f, 11.537907f),
    Station("Mittersendling", "MMT", 8004154, 1300, arrayOf(7, 20), 48.10778f, 11.53643f),
    Station("Siemenswerke", "MSW", 8004137, 1310, arrayOf(7, 20), 48.094257f, 11.532758f),
    Station("Solln", "MSN", 8004161, 1320, arrayOf(7, 20), 48.079502f, 11.527155f),
    Station("Großhesselohe Isartalbahnhof", "MGOI", 8002422, 2500, arrayOf(7, 20), 48.071083f, 11.530912f),
    Station("Pullach", "MPUL", 8004899, 2520, arrayOf(7, 20), 48.05869f, 11.521517f),
    Station("Höllriegelskreuth", "MHRK", 8002899, 2530, arrayOf(7, 20), 48.043446f, 11.509796f),
    Station("Buchenhain", "MBHA", 8001231, 2540, arrayOf(7), 48.032572f, 11.497924f),
    Station("Baierbrunn", "MBAB", 8000781, 2550, arrayOf(7), 48.019048f, 11.48032f),
    Station("Hohenschäftlarn", "MHSL", 8002955, 2560, arrayOf(7), 47.990608f, 11.456086f),
    Station("Ebenhausen-Schäftlarn", "MEBS", 8001621, 2570, arrayOf(7), 47.978788f, 11.45534f),
    Station("Icking", "MIC", 8003039, 4750, arrayOf(7), 47.952228f, 11.436662f),
    Station("Wolfratshausen", "MWO", 8006550, 4760, arrayOf(7), 47.914072f, 11.42656f),
    Station("Perlach", "MPER", 8004159, 1000, arrayOf(7), 48.09344f, 11.630838f),
    Station("Neuperlach Süd", "MNPS", 8006696, 1010, arrayOf(7), 48.08938f, 11.644554f),
    Station("Neubiberg", "MNB", 8004252, 2200, arrayOf(7), 48.07572f, 11.660415f),
    Station("Ottobrunn", "MOBR", 8004733, 2210, arrayOf(7), 48.06301f, 11.678729f),
    Station("Hohenbrunn", "MHOB", 8002940, 2220, arrayOf(7), 48.046856f, 11.698892f),
    Station("Wächterhof", "MWAE", 8006131, 2230, arrayOf(7), 48.037116f, 11.713376f),
    Station("Höhenkirchen-Siegertsbrunn", "MHSB", 8002894, 2240, arrayOf(7), 48.018548f, 11.71919f),
    Station("Dürrnhaar", "MDHR", 8001578, 2250, arrayOf(7), 47.992728f, 11.734376f),
    Station("Aying", "MAY", 8000675, 2260, arrayOf(7), 47.969384f, 11.769624f),
    Station("Peiß", "MPEI", 8004761, 2270, arrayOf(7), 47.961292f, 11.778284f),
    Station("Großhelfendorf", "MGHD", 8002420, 2280, arrayOf(7), 47.94472f, 11.781566f),
    Station("Kreuzstraße", "MKZ", 8003438, 4350, arrayOf(7), 47.917128f, 11.759098f),
    Station("Riem", "MRI P", 8004160, 800, arrayOf(2), 48.144146f, 11.678869f),
    Station("Feldkirchen", "MFK", 8001973, 2110, arrayOf(2), 48.1517f, 11.731459f),
    Station("Heimstetten", "MHEM", 8002715, 2120, arrayOf(2), 48.158924f, 11.760298f),
    Station("Grub", "MGRB", 8002435, 3950, arrayOf(2), 48.164452f, 11.782278f),
    Station("Poing", "MPO", 8004854, 3960, arrayOf(2), 48.171256f, 11.80938f),
    Station("Markt Schwaben", "MSB", 8003879, 3970, arrayOf(2), 48.192924f, 11.862054f),
    Station("Ottenhofen", "MSB", 8004723, 3250, arrayOf(2), 48.21804f, 11.878566f),
    Station("St. Koloman", "MKL", 8005652, 3260, arrayOf(2), 48.24416f, 11.882894f),
    Station("Aufhausen", "MAFE", 8000653, 3270, arrayOf(2), 48.275064f, 11.894422f),
    Station("Altenerding", "MANE", 8000524, 3280, arrayOf(2), 48.2933f, 11.901312f),
    Station("Erding", "MER", 8001825, 3290, arrayOf(2), 48.303056f, 11.91139f)
)

data class Station(
    val name: String,
    val alias: String,
    val dbId: Int,
    val mvgId: Int,
    val lines: Array<Int>,
    val latitude: Float,
    val longitude: Float
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Station

        if (name != other.name) return false
        if (alias != other.alias) return false
        if (dbId != other.dbId) return false
        if (mvgId != other.mvgId) return false
        if (!lines.contentEquals(other.lines)) return false
        if (latitude != other.latitude) return false
        if (longitude != other.longitude) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + alias.hashCode()
        result = 31 * result + dbId
        result = 31 * result + mvgId
        result = 31 * result + lines.contentHashCode()
        result = 31 * result + latitude.hashCode()
        result = 31 * result + longitude.hashCode()
        return result
    }
}

// Utility functions for working with stations:

fun filterByLine(line: Int): List<Station> = STATIONS.asIterable().filterByLine(line)

fun Iterable<Station>.filterByLine(line: Int): List<Station> {
    return this.filter { it.lines.contains(line) }
}

fun Iterable<Station>.withNameAsKey(): Map<String, Station> = withKey(0)
fun Iterable<Station>.withAliasAsKey(): Map<String, Station> = withKey(1)
fun Iterable<Station>.withDbIdAsKey(): Map<Int, Station> = withKey(2)
fun Iterable<Station>.withMvgIdAsKey(): Map<Int, Station> = withKey(3)

@Suppress("UNCHECKED_CAST", "NOTHING_TO_INLINE")
private inline fun <K> Iterable<Station>.withKey(i: Int) = when (i) {
    0 -> this.map { it.name to it }.toMap() as Map<K, Station>
    1 -> this.map { it.alias to it }.toMap() as Map<K, Station>
    2 -> this.map { it.dbId to it }.toMap() as Map<K, Station>
    3 -> this.map { it.mvgId to it }.toMap() as Map<K, Station>
    else -> throw RuntimeException()
}