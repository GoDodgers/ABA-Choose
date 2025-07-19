package com.example.abachoose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Accessible
import androidx.compose.material.icons.automirrored.filled.AccessibleForward
import androidx.compose.material.icons.automirrored.filled.AddToHomeScreen
import androidx.compose.material.icons.automirrored.filled.AirplaneTicket
import androidx.compose.material.icons.automirrored.filled.AlignHorizontalLeft
import androidx.compose.material.icons.automirrored.filled.AlignHorizontalRight
import androidx.compose.material.icons.automirrored.filled.AltRoute
import androidx.compose.material.icons.automirrored.filled.Announcement
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowBackIos
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.ArrowForwardIos
import androidx.compose.material.icons.automirrored.filled.ArrowLeft
import androidx.compose.material.icons.automirrored.filled.ArrowRight
import androidx.compose.material.icons.automirrored.filled.ArrowRightAlt
import androidx.compose.material.icons.automirrored.filled.Article
import androidx.compose.material.icons.automirrored.filled.Assignment
import androidx.compose.material.icons.automirrored.filled.AssignmentReturn
import androidx.compose.material.icons.automirrored.filled.AssistantDirection
import androidx.compose.material.icons.automirrored.filled.Backspace
import androidx.compose.material.icons.automirrored.filled.BatteryUnknown
import androidx.compose.material.icons.automirrored.filled.BluetoothSearching
import androidx.compose.material.icons.automirrored.filled.BrandingWatermark
import androidx.compose.material.icons.automirrored.filled.CallMade
import androidx.compose.material.icons.automirrored.filled.CallMerge
import androidx.compose.material.icons.automirrored.filled.CallMissed
import androidx.compose.material.icons.automirrored.filled.CallMissedOutgoing
import androidx.compose.material.icons.automirrored.filled.CallReceived
import androidx.compose.material.icons.automirrored.filled.CallSplit
import androidx.compose.material.icons.automirrored.filled.Chat
import androidx.compose.material.icons.automirrored.filled.ChromeReaderMode
import androidx.compose.material.icons.automirrored.filled.Comment
import androidx.compose.material.icons.automirrored.filled.CompareArrows
import androidx.compose.material.icons.automirrored.filled.ContactSupport
import androidx.compose.material.icons.automirrored.filled.DirectionsBike
import androidx.compose.material.icons.automirrored.filled.DirectionsRun
import androidx.compose.material.icons.automirrored.filled.DirectionsWalk
import androidx.compose.material.icons.automirrored.filled.DriveFileMove
import androidx.compose.material.icons.automirrored.filled.Dvr
import androidx.compose.material.icons.automirrored.filled.EventNote
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material.icons.automirrored.filled.FactCheck
import androidx.compose.material.icons.automirrored.filled.FeaturedPlayList
import androidx.compose.material.icons.automirrored.filled.FeaturedVideo
import androidx.compose.material.icons.automirrored.filled.Feed
import androidx.compose.material.icons.automirrored.filled.FollowTheSigns
import androidx.compose.material.icons.automirrored.filled.FormatAlignLeft
import androidx.compose.material.icons.automirrored.filled.FormatAlignRight
import androidx.compose.material.icons.automirrored.filled.FormatIndentDecrease
import androidx.compose.material.icons.automirrored.filled.FormatIndentIncrease
import androidx.compose.material.icons.automirrored.filled.FormatListBulleted
import androidx.compose.material.icons.automirrored.filled.FormatTextdirectionLToR
import androidx.compose.material.icons.automirrored.filled.FormatTextdirectionRToL
import androidx.compose.material.icons.automirrored.filled.Forward
import androidx.compose.material.icons.automirrored.filled.ForwardToInbox
import androidx.compose.material.icons.automirrored.filled.Grading
import androidx.compose.material.icons.automirrored.filled.Help
import androidx.compose.material.icons.automirrored.filled.HelpCenter
import androidx.compose.material.icons.automirrored.filled.HelpOutline
import androidx.compose.material.icons.automirrored.filled.Input
import androidx.compose.material.icons.automirrored.filled.InsertComment
import androidx.compose.material.icons.automirrored.filled.InsertDriveFile
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.automirrored.filled.KeyboardBackspace
import androidx.compose.material.icons.automirrored.filled.KeyboardReturn
import androidx.compose.material.icons.automirrored.filled.KeyboardTab
import androidx.compose.material.icons.automirrored.filled.Label
import androidx.compose.material.icons.automirrored.filled.LabelImportant
import androidx.compose.material.icons.automirrored.filled.LabelOff
import androidx.compose.material.icons.automirrored.filled.LastPage
import androidx.compose.material.icons.automirrored.filled.Launch
import androidx.compose.material.icons.automirrored.filled.LibraryBooks
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.automirrored.filled.ListAlt
import androidx.compose.material.icons.automirrored.filled.LiveHelp
import androidx.compose.material.icons.automirrored.filled.Login
import androidx.compose.material.icons.automirrored.filled.Logout
import androidx.compose.material.icons.automirrored.filled.ManageSearch
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.automirrored.filled.MenuOpen
import androidx.compose.material.icons.automirrored.filled.MergeType
import androidx.compose.material.icons.automirrored.filled.Message
import androidx.compose.material.icons.automirrored.filled.MissedVideoCall
import androidx.compose.material.icons.automirrored.filled.MobileScreenShare
import androidx.compose.material.icons.automirrored.filled.More
import androidx.compose.material.icons.automirrored.filled.MultilineChart
import androidx.compose.material.icons.automirrored.filled.NavigateBefore
import androidx.compose.material.icons.automirrored.filled.NavigateNext
import androidx.compose.material.icons.automirrored.filled.NextPlan
import androidx.compose.material.icons.automirrored.filled.NextWeek
import androidx.compose.material.icons.automirrored.filled.NotListedLocation
import androidx.compose.material.icons.automirrored.filled.Note
import androidx.compose.material.icons.automirrored.filled.NoteAdd
import androidx.compose.material.icons.automirrored.filled.Notes
import androidx.compose.material.icons.automirrored.filled.OfflineShare
import androidx.compose.material.icons.automirrored.filled.OpenInNew
import androidx.compose.material.icons.automirrored.filled.Outbound
import androidx.compose.material.icons.automirrored.filled.PhoneCallback
import androidx.compose.material.icons.automirrored.filled.PhoneForwarded
import androidx.compose.material.icons.automirrored.filled.PhoneMissed
import androidx.compose.material.icons.automirrored.filled.PlaylistAdd
import androidx.compose.material.icons.automirrored.filled.PlaylistAddCheck
import androidx.compose.material.icons.automirrored.filled.PlaylistPlay
import androidx.compose.material.icons.automirrored.filled.QueueMusic
import androidx.compose.material.icons.automirrored.filled.ReadMore
import androidx.compose.material.icons.automirrored.filled.ReceiptLong
import androidx.compose.material.icons.automirrored.filled.Redo
import androidx.compose.material.icons.automirrored.filled.Reply
import androidx.compose.material.icons.automirrored.filled.ReplyAll
import androidx.compose.material.icons.automirrored.filled.RotateLeft
import androidx.compose.material.icons.automirrored.filled.RotateRight
import androidx.compose.material.icons.automirrored.filled.Rtt
import androidx.compose.material.icons.automirrored.filled.Rule
import androidx.compose.material.icons.automirrored.filled.ScheduleSend
import androidx.compose.material.icons.automirrored.filled.ScreenShare
import androidx.compose.material.icons.automirrored.filled.Segment
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.automirrored.filled.SendAndArchive
import androidx.compose.material.icons.automirrored.filled.SendToMobile
import androidx.compose.material.icons.automirrored.filled.ShortText
import androidx.compose.material.icons.automirrored.filled.Shortcut
import androidx.compose.material.icons.automirrored.filled.ShowChart
import androidx.compose.material.icons.automirrored.filled.Sort
import androidx.compose.material.icons.automirrored.filled.SpeakerNotes
import androidx.compose.material.icons.automirrored.filled.StarHalf
import androidx.compose.material.icons.automirrored.filled.StickyNote2
import androidx.compose.material.icons.automirrored.filled.StopScreenShare
import androidx.compose.material.icons.automirrored.filled.Subject
import androidx.compose.material.icons.automirrored.filled.TextSnippet
import androidx.compose.material.icons.automirrored.filled.Toc
import androidx.compose.material.icons.automirrored.filled.TrendingDown
import androidx.compose.material.icons.automirrored.filled.TrendingFlat
import androidx.compose.material.icons.automirrored.filled.TrendingUp
import androidx.compose.material.icons.automirrored.filled.Undo
import androidx.compose.material.icons.automirrored.filled.ViewList
import androidx.compose.material.icons.automirrored.filled.ViewQuilt
import androidx.compose.material.icons.automirrored.filled.ViewSidebar
import androidx.compose.material.icons.automirrored.filled.VolumeDown
import androidx.compose.material.icons.automirrored.filled.VolumeMute
import androidx.compose.material.icons.automirrored.filled.VolumeOff
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material.icons.automirrored.filled.WrapText
import androidx.compose.material.icons.automirrored.filled.Wysiwyg
import androidx.compose.material.icons.filled.ClearAll
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.currentRecomposeScope
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.abachoose.composables.AnimatedDialog
import com.example.abachoose.domain.Question
import com.example.abachoose.domain.ScreenConfig
import com.example.abachoose.domain.makeAbTest
import com.example.abachoose.domain.makeColorTest
import com.example.abachoose.domain.makeLetterAssociationTest
import com.example.abachoose.domain.makeWordAssociationTest
import com.example.abachoose.ui.theme.ABAChooseTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ABAChooseTheme {
                val viewModel by viewModels<MainViewModel>()
                val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
                val scope = rememberCoroutineScope()

                NavDrawer(viewModel, drawerState, scope)
            }
        }
    }
}

@Composable
fun NavDrawer(
    viewModel: MainViewModel,
    drawerState: DrawerState,
    scope: CoroutineScope
) {
    var expandTests by remember { mutableStateOf(false) }
    var expandHistory by remember { mutableStateOf(false) }

    ModalNavigationDrawer(
        drawerState = drawerState,
        gesturesEnabled = false,
        drawerContent = {
            ModalDrawerSheet {
                // Header and back button
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text("Menu", modifier = Modifier.padding(16.dp))
                    IconButton(
                        onClick = {
                            scope.launch {
                                drawerState.close()
                            }
                        }
                    ) {
                        Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardBackspace, contentDescription = "close")
                    }
                }

                HorizontalDivider()

                // Top-level
                NavigationDrawerItem(
                    label = { Text(text = "Tests") },
                    selected = false,
                    onClick = { expandTests = !expandTests },
                    badge = {
                        if (!expandTests) {
                            Icon(Icons.AutoMirrored.Default.MenuOpen, contentDescription = "expand")
                        } else {
                            Icon(Icons.Default.ClearAll, contentDescription = "close")
                        }
                    }
                )
                // Dropdown items
                if (expandTests) {
                    Column(modifier = Modifier.padding(start = 16.dp)) {
                        viewModel.allTests.forEachIndexed { i, test ->
                            NavigationDrawerItem(
                                label = { Text(test.name) },
                                selected = false,
                                onClick = {}
                            )
                        }
                    }
                }
                // Another main item
                NavigationDrawerItem(
                    label = { Text(text = "Test History") },
                    selected = false,
                    onClick = { expandHistory = !expandHistory },
                    badge = {
                        if (!expandHistory) {
                            Icon(Icons.AutoMirrored.Default.MenuOpen, contentDescription = "expand")
                        } else {
                            Icon(Icons.Default.ClearAll, contentDescription = "close")
                        }
                    }
                )

                // Dropdown items
                if (expandHistory) {
                    Column(modifier = Modifier.padding(start = 16.dp)) {
                        viewModel.history.forEachIndexed { i, test ->
                            NavigationDrawerItem(
                                label = { Text("${ i + 1 }) ${ test.name }") },
                                selected = false,
                                onClick = {},
                                badge = { Text("${ test.totalScore }") }
                            )
                        }
                    }
                }
            }
        }
    ) {
        ABAChoose(viewModel, "ABA Choose", drawerState, scope)
    }
}

@Composable
fun ABAChoose(
    viewModel: MainViewModel,
    titleText: String,
    drawerState: DrawerState,
    scope: CoroutineScope,
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopBar(titleText, drawerState, scope)
        },
        bottomBar = {
            BottomBar(viewModel)
        }
    ) { innerPadding ->
        if (viewModel.currentTest.questions.isEmpty()) {
            ChooseTest(viewModel, innerPadding)
        } else {
            Chooser(viewModel, innerPadding)
        }
    }
}

@Composable
fun ChooseTest(viewModel: MainViewModel, paddingValues: PaddingValues) {
    Box (
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        LazyColumn (modifier = Modifier
            .fillMaxHeight()
            .padding(top = 24.dp)) {
            viewModel.allTests.forEachIndexed { i, test ->
                item {
                    Button(
                        modifier = Modifier
                            .fillMaxWidth(0.6f)
                            .height(64.dp)
                            .padding(bottom = 12.dp),
                        onClick = {
                            if (test.name == "abTest") {
                                viewModel.currentTest = makeAbTest()
                            } else if (test.name == "colorTest") {
                                viewModel.currentTest = makeColorTest()
                            } else if (test.name == "letterAssociationTest") {
                                viewModel.currentTest = makeLetterAssociationTest()
                            } else if (test.name == "wordAssociationTest") {
                                viewModel.currentTest = makeWordAssociationTest()
                            } else {
                                // err
                            }
                        }
                    ) {
                        Text(test.displayName)
                    }
                }
            }
        }
    }
}

@Composable
fun Chooser(
    viewModel: MainViewModel,
    paddingValues: PaddingValues
) {
    Box (
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize(),
    ) {
        val windowSizeClass = currentWindowAdaptiveInfo().windowSizeClass
        val screenConfig = ScreenConfig.configureScreenSize(windowSizeClass)

        val currentQuestion = viewModel.currentTest.questions[viewModel.currentQuestionIndex]
        // random img position
        val imgA = if (viewModel.imgAPos == 0) { painterResource(currentQuestion.option1ImgSrc) } else { painterResource(currentQuestion.option2ImgSrc) }
        val imgB = if (viewModel.imgBPos == 0) { painterResource(currentQuestion.option1ImgSrc) } else { painterResource(currentQuestion.option2ImgSrc) }
        // normalize image size
        val imgSize = if (imgA.intrinsicSize.height < imgB.intrinsicSize.height) { imgA } else { imgB }

        when(screenConfig) {
            ScreenConfig.MOBILE_PORTRAIT -> MobilePortrait(viewModel, imgA, imgB, imgSize, currentQuestion)
            ScreenConfig.MOBILE_LANDSCAPE -> MobileLandscape(viewModel, imgA, imgB, currentQuestion)
            ScreenConfig.DESKTOP_TABLET -> MobilePortrait(viewModel, imgA, imgB, imgSize, currentQuestion)
        }
    }
}

@Composable
fun MobileLandscape(
    viewModel: MainViewModel,
    imgA: Painter,
    imgB: Painter,
    currentQuestion: Question
) {
    var titleFontSize by remember {
        mutableStateOf(96.sp)
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        Row (
            modifier = Modifier.fillMaxSize(0.9f),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp),
                contentAlignment = Alignment.TopCenter
            ) {
                Row (
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Card (
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 4.dp, end = 2.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .border(
                                width = 4.dp,
                                color =
                                    if (!viewModel.imgAClicked) {
                                        Color.Black
                                    } else if ((viewModel.imgAClicked || viewModel.imgBClicked) && (if (viewModel.imgAPos == 0) {
                                            currentQuestion.option1Name == currentQuestion.answer
                                        } else {
                                            currentQuestion.option2Name == currentQuestion.answer
                                        })
                                    ) {
                                        Color.Green
                                    } else {
                                        Color.Red
                                    },
                                shape = RoundedCornerShape(8.dp)
                            ),
                        onClick = {
                            // card toggle
                            if (!viewModel.imgBClicked) {
                                viewModel.imgAClicked = !viewModel.imgAClicked
                            }
                            // current user answer
                            if (viewModel.imgAClicked) {
                                viewModel.selectedA = if (viewModel.imgAPos == 0) { currentQuestion.option1Name } else { currentQuestion.option2Name }
                            } else {
                                viewModel.selectedA = ""
                            }
                        },
                        enabled = (!viewModel.imgAClicked && !viewModel.imgBClicked) || !viewModel.getQuestionStatus()
                    ) {
                        Image(
                            imgA,
                            contentDescription = currentQuestion.name,
                            modifier = Modifier
                                .weight(1f, fill = false)
                                .aspectRatio(200.dp/200.dp)
                                .fillMaxWidth()
                                .background(Color.White)
                        )
                    }
                }
            }
            // scoreboard
            Box(
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp),
                contentAlignment = Alignment.Center
            ) {
                Column (
                    modifier = Modifier.fillMaxHeight().padding(vertical = 8.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Row (
                        modifier = Modifier
                            .fillMaxWidth(0.9f),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = currentQuestion.question.replaceFirstChar { it.uppercase() },
                            modifier = Modifier,
                            textAlign = TextAlign.Center,
                            fontSize = titleFontSize,
                            maxLines = 1,
                            onTextLayout = { if (it.multiParagraph.didExceedMaxLines) { titleFontSize *= .95F } }
                        )
                    }
                    // scoreboard
                    Row(
                        modifier = Modifier.fillMaxWidth(0.9f),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Box(
                            modifier = Modifier
                                .size(48.dp)
                                .border(width = 2.dp, color = Color.Black, shape = RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = viewModel.currentTest.totalScore.toString())
                        }
                        Box(modifier = Modifier.size(48.dp), contentAlignment = Alignment.Center) { Text("/") }
                        Box(
                            modifier = Modifier
                                .size(48.dp)
                                .border(width = 2.dp, color = Color.Black, shape = RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = (viewModel.currentTest.questions.size + 1).toString(),
                                maxLines = 1
                            )
                        }
                    }
                }
            }
            // image b
            Box(
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp),
                contentAlignment = Alignment.TopCenter
            ) {

                Row (
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Card (
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 2.dp, end = 4.dp)
                            .border(
                                width = 4.dp,
                                color = if (!viewModel.imgBClicked) {
                                    Color.Black
                                } else if ((viewModel.imgAClicked || viewModel.imgBClicked) && (if (viewModel.imgBPos == 0) {
                                        currentQuestion.option1Name == currentQuestion.answer
                                    } else {
                                        currentQuestion.option2Name == currentQuestion.answer
                                    })
                                ) {
                                    Color.Green
                                } else {
                                    Color.Red
                                },
                                shape = RoundedCornerShape(8.dp)
                            ),
                        onClick = {
                            // card toggle
                            if (!viewModel.imgAClicked) {
                                viewModel.imgBClicked = !viewModel.imgBClicked
                            }
                            // current user answer
                            if (viewModel.imgBClicked) {
                                viewModel.selectedB = if (viewModel.imgBPos == 0) { currentQuestion.option1Name } else { currentQuestion.option2Name }
                            } else {
                                viewModel.selectedB = ""
                            }
                        },
                        enabled = (!viewModel.imgAClicked && !viewModel.imgBClicked) || !viewModel.getQuestionStatus()
                    ) {
                        Image(
                            imgB,
                            contentDescription = currentQuestion.name,
                            modifier = Modifier
                                .weight(1f, fill = false)
                                .aspectRatio(200.dp/200.dp)
                                .fillMaxWidth()
                                .background(Color.White)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun MobilePortrait(
    viewModel: MainViewModel,
    imgA: Painter,
    imgB: Painter,
    imgSize: Painter,
    currentQuestion: Question
) {
    Column (
        modifier = Modifier
            .fillMaxHeight(.90f)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally,
    )  {
        var titleFontSize by remember {
            mutableStateOf(96.sp)
        }
        // header
        Row (
            modifier = Modifier
                .fillMaxWidth(0.9f),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = currentQuestion.question.replaceFirstChar { it.uppercase() },
                modifier = Modifier,
                textAlign = TextAlign.Center,
                fontSize = titleFontSize,
                maxLines = 1,
                onTextLayout = { if (it.multiParagraph.didExceedMaxLines) { titleFontSize *= .95F } }
            )
        }
        // Images
        Row (
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Card (
                modifier = Modifier
                    .fillMaxWidth(.5f)
                    .padding(start = 4.dp, end = 2.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .border(
                        width = 4.dp,
                        color =
                            if (!viewModel.imgAClicked) {
                                Color.Black
                            } else if ((viewModel.imgAClicked || viewModel.imgBClicked) && (if (viewModel.imgAPos == 0) {
                                    currentQuestion.option1Name == currentQuestion.answer
                                } else {
                                    currentQuestion.option2Name == currentQuestion.answer
                                })
                            ) {
                                Color.Green
                            } else {
                                Color.Red
                            },
                        shape = RoundedCornerShape(8.dp)
                    ),
                onClick = {
                    // card toggle
                    if (!viewModel.imgBClicked) {
                        viewModel.imgAClicked = !viewModel.imgAClicked
                    }
                    // current user answer
                    if (viewModel.imgAClicked) {
                        viewModel.selectedA = if (viewModel.imgAPos == 0) { currentQuestion.option1Name } else { currentQuestion.option2Name }
                    } else {
                        viewModel.selectedA = ""
                    }
                },
                enabled = (!viewModel.imgAClicked && !viewModel.imgBClicked) || !viewModel.getQuestionStatus()
            ) {
                Image(
                    imgA,
                    contentDescription = currentQuestion.name,
                    modifier = Modifier
                        .weight(1f, fill = false)
                        .aspectRatio(imgSize.intrinsicSize.width / imgSize.intrinsicSize.height)
                        .fillMaxWidth()
                        .background(Color.White)
                )
            }
            Card (
                modifier = Modifier
                    .padding(start = 2.dp, end = 4.dp)
                    .border(
                        width = 4.dp,
                        color = if (!viewModel.imgBClicked) {
                            Color.Black
                        } else if ((viewModel.imgAClicked || viewModel.imgBClicked) && (if (viewModel.imgBPos == 0) {
                                currentQuestion.option1Name == currentQuestion.answer
                            } else {
                                currentQuestion.option2Name == currentQuestion.answer
                            })
                        ) {
                            Color.Green
                        } else {
                            Color.Red
                        },
                        shape = RoundedCornerShape(8.dp)
                    ),
                onClick = {
                    // card toggle
                    if (!viewModel.imgAClicked) {
                        viewModel.imgBClicked = !viewModel.imgBClicked
                    }
                    // current user answer
                    if (viewModel.imgBClicked) {
                        viewModel.selectedB = if (viewModel.imgBPos == 0) { currentQuestion.option1Name } else { currentQuestion.option2Name }
                    } else {
                        viewModel.selectedB = ""
                    }
                },
                enabled = (!viewModel.imgAClicked && !viewModel.imgBClicked) || !viewModel.getQuestionStatus()
            ) {
                Image(
                    imgB,
                    contentDescription = currentQuestion.name,
                    modifier = Modifier
                        .weight(1f, fill = false)
                        .aspectRatio(imgSize.intrinsicSize.width / imgSize.intrinsicSize.height)
                        .fillMaxWidth()
                        .background(Color.White)
                )
            }
        }
        // scoreboard
        Row(
            modifier = Modifier.fillMaxWidth(0.35f),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Box(
                modifier = Modifier
                    .size(48.dp)
                    .border(width = 2.dp, color = Color.Black, shape = RoundedCornerShape(8.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text(text = viewModel.currentTest.totalScore.toString())
            }
            Box(modifier = Modifier.size(48.dp), contentAlignment = Alignment.Center) { Text("/") }
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .border(width = 2.dp, color = Color.Black, shape = RoundedCornerShape(8.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text(text = (viewModel.currentTest.questions.size + 1).toString())
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    titleText: String,
    drawerState: DrawerState,
    scope: CoroutineScope
) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = titleText
            )
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.AutoMirrored.Filled.HelpOutline, contentDescription = "")
            }
        },
        navigationIcon = {
            IconButton(onClick = {
                scope.launch {
                    if (drawerState.isClosed) {
                        drawerState.open()
                    } else {
                        drawerState.close()
                    }
                }
            }) {
                Icon(Icons.Default.Menu, contentDescription = "Menu")
            }
        }
    )
}

@Composable
fun BottomBar(viewModel: MainViewModel) {
    BottomAppBar(
        actions = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {

                Button(
                    modifier = Modifier
                        .fillMaxHeight(0.8f)
                        .width(104.dp),
                    onClick = {
                        navigateQuestion(viewModel, { viewModel.decreaseCurrentQuestionIndex() })
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = MaterialTheme.colorScheme.onPrimary
                    ),
                    enabled = viewModel.getQuestionStatus()
                ) {
                    Icon(
                        modifier = Modifier.scale(2.5f).padding(start = 10.dp),
                        imageVector = Icons.AutoMirrored.Default.ArrowBackIos,
                        contentDescription = "previous"
                    )
                }
                Button(
                    modifier = Modifier
                        .fillMaxHeight(0.8f)
                        .width(104.dp),
                    onClick = {
                        navigateQuestion(viewModel, { viewModel.increaseCurrentQuestionIndex() })
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = MaterialTheme.colorScheme.onPrimary
                    ),
                    enabled = viewModel.getQuestionStatus()
                ) {
                    Icon(
                        modifier = Modifier.scale(2.5f).padding(start = 6.dp),
                        imageVector = Icons.AutoMirrored.Default.ArrowForwardIos,
                        contentDescription = "next"
                    )
                }
            }
        }
    )
}

fun navigateQuestion(viewModel: MainViewModel, buttonAction: () -> Unit) {
    val currentQuestion = viewModel.currentTest.questions[viewModel.currentQuestionIndex]
    currentQuestion.answered = true
    currentQuestion.answeredCorrectly = viewModel.selectedA == currentQuestion.answer || viewModel.selectedB == currentQuestion.answer

    if (currentQuestion.answeredCorrectly!! && currentQuestion.score == 0) {
        currentQuestion.score = 1
        viewModel.currentTest.totalScore += 1
    }
    // if final quesiton answered add to history
    if (viewModel.currentTest.questions.last().answered) {
        viewModel.history.add(viewModel.currentTest)
    } else {
        buttonAction.invoke()
    }
    viewModel.clear()
}

@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true, showSystemUi = true)
fun ChoosePreview() {
    Scaffold { innerPadding ->
        Box(
            modifier = Modifier.padding(innerPadding)
        ) {
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Column {
                    Text("A", textAlign = TextAlign.Center)
                    Icon(imageVector = Icons.AutoMirrored.Filled.AddToHomeScreen, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Accessible, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.AccessibleForward, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Announcement, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.ArrowForward, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBackIos, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.ArrowForwardIos, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.ArrowRightAlt, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.ArrowLeft, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.ArrowRight, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Article, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.AirplaneTicket, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.AlignHorizontalLeft, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.AlignHorizontalRight, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.AltRoute, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Assignment, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.AssignmentReturn, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.AssistantDirection, contentDescription = "")
                    Text("B")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Backspace, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.BatteryUnknown, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.BrandingWatermark, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.BluetoothSearching, contentDescription = "")
                }
                Column {
                    Text("C")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Chat, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Comment, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.CallMade, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.CallMerge, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.CallSplit, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.CallMissed, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.CallReceived, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.CallMissedOutgoing, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.ChromeReaderMode, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.CompareArrows, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.ContactSupport, contentDescription = "")
                    Text("D")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Dvr, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.DirectionsRun, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.DirectionsBike, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.DirectionsWalk, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.DriveFileMove, contentDescription = "")
                    Text("E")
                    Icon(imageVector = Icons.AutoMirrored.Filled.EventNote, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.ExitToApp, contentDescription = "")
                }
                Column {
                    Text("F")
                    Icon(imageVector = Icons.AutoMirrored.Filled.FactCheck, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.FeaturedPlayList, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.FeaturedVideo, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Feed, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.FollowTheSigns, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.FormatAlignLeft, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.FormatAlignRight, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.FormatIndentDecrease, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.FormatIndentIncrease, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.FormatListBulleted, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.FormatTextdirectionLToR, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.FormatTextdirectionRToL, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Forward, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.ForwardToInbox, contentDescription = "")
                    Text("G")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Grading, contentDescription = "")
                    Text("H")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Help, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.HelpCenter, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.HelpOutline, contentDescription = "")
                    Text("I")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Input, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.InsertComment, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.InsertDriveFile, contentDescription = "")
                }
                Column {
                    Text("J")
                    Text("K")
                    Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowLeft, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardBackspace, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardReturn, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardTab, contentDescription = "")
                    Text("L")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Label, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.LabelImportant, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.LabelOff, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.LastPage, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Launch, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.LibraryBooks, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.List, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.ListAlt, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.LiveHelp, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Login, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Logout, contentDescription = "")
                }
                Column {
                    Text("M")
                    Icon(imageVector = Icons.AutoMirrored.Filled.ManageSearch, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.MenuBook, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.MenuOpen, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.MergeType, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Message, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.MissedVideoCall, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.MobileScreenShare, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.More, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.MultilineChart, contentDescription = "")
                    Text("N")
                    Icon(imageVector = Icons.AutoMirrored.Filled.NavigateBefore, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.NavigateNext, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.NextPlan, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.NextWeek, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Note, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.NoteAdd, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Notes, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.NotListedLocation, contentDescription = "")
                    Text("O")
                    Icon(imageVector = Icons.AutoMirrored.Filled.OfflineShare, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.OpenInNew, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Outbound, contentDescription = "")
                }
                Column {
                    Text("P")
                    Icon(imageVector = Icons.AutoMirrored.Filled.PhoneCallback, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.PhoneForwarded, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.PhoneMissed, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.PlaylistAdd, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.PlaylistAddCheck, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.PlaylistPlay, contentDescription = "")
                    Text("Q")
                    Icon(imageVector = Icons.AutoMirrored.Filled.QueueMusic, contentDescription = "")
                    Text("R")
                    Icon(imageVector = Icons.AutoMirrored.Filled.ReadMore, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.ReceiptLong, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Redo, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Reply, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.ReplyAll, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.RotateLeft, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.RotateRight, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Rtt, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Rule, contentDescription = "")
                }
                Column {
                    Text("S")
                    Icon(imageVector = Icons.AutoMirrored.Filled.ScheduleSend, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.ScreenShare, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Segment, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Send, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.SendAndArchive, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.SendToMobile, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Shortcut, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.ShortText, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.ShowChart, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Sort, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.SpeakerNotes, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.StarHalf, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.StickyNote2, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.StopScreenShare, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Subject, contentDescription = "")
                    Text("T")
                    Icon(imageVector = Icons.AutoMirrored.Filled.TextSnippet, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Toc, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.TrendingDown, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.TrendingFlat, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.TrendingUp, contentDescription = "")
                    Text("U")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Undo, contentDescription = "")
                }
                Column {
                    Text("V")
                    Icon(imageVector = Icons.AutoMirrored.Filled.ViewList, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.ViewQuilt, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.ViewSidebar, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.VolumeDown, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.VolumeMute, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.VolumeOff, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.VolumeUp, contentDescription = "")
                    Text("W")
                    Icon(imageVector = Icons.AutoMirrored.Filled.WrapText, contentDescription = "")
                    Icon(imageVector = Icons.AutoMirrored.Filled.Wysiwyg, contentDescription = "")
                    Text("Y")
                    Text("Z")
                }
            }
        }
    }
}
