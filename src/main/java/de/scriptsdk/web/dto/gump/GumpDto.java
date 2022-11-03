package de.scriptsdk.web.dto.gump;

import de.scriptsdk.api.model.gump.components.*;
import de.scriptsdk.core.exceptions.BaseException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class GumpDto {
    private List<GroupDto> groups = new ArrayList<>();
    private List<GroupDto> endGroups = new ArrayList<>();
    private List<GumpButtonDto> buttons = new ArrayList<>();
    private List<ButtonTileArtDto> buttonTileArts = new ArrayList<>();
    private List<CheckBoxDto> checkBoxes = new ArrayList<>();
    private List<CheckerTransDto> checkerTrans = new ArrayList<>();
    private List<CroppedTextDto> croppedTexts = new ArrayList<>();
    private List<GumpPictureDto> gumpPictures = new ArrayList<>();
    private List<GumpTilePictureDto> gumpTilePictures = new ArrayList<>();
    private List<RadioButtonDto> radioButtons = new ArrayList<>();
    private List<ResizablePictureDto> resizablePictures = new ArrayList<>();
    private List<GumpTextDto> gumpTexts = new ArrayList<>();
    private List<TextEntryDto> textEntries = new ArrayList<>();
    private List<String> texts = new ArrayList<>();
    private List<LimitedTextEntryDto> limitedTextEntries = new ArrayList<>();
    private List<TilePictureDto> tilePictures = new ArrayList<>();
    private List<HuedTilePictureDto> huedTilePictures = new ArrayList<>();
    private List<GumpTooltipDto> gumpTooltips = new ArrayList<>();
    private List<HtmlGumpDto> htmlGumps = new ArrayList<>();
    private List<XmfHtmlGumpDto> xmfHtmlGumps = new ArrayList<>();
    private List<XmfHtmlGumpColorDto> xmfHtmlGumpColors = new ArrayList<>();
    private List<XmfHtmlTokenDto> xmfHtmlTokens = new ArrayList<>();
    private List<ItemPropertyDto> itemProperties = new ArrayList<>();
    private List<PictureInPictureDto> pictureInPictures = new ArrayList<>();
    private List<TilePictureAsGumpPictureDto> tilePictureAsGumpPictures = new ArrayList<>();
    private List<UpperWordCaseToggleDto> upperWordCaseToggles = new ArrayList<>();
    private List<HuedGumpPictureDto> huedGumpPictures = new ArrayList<>();
    private Integer x;
    private Integer y;
    private Integer serial = 0;
    private Long gumpId = 0L;
    private Integer pages = 0;
    private Boolean movable = false;
    private Boolean resizable = false;
    private Boolean disposable = false;
    private Boolean closable = false;

    public GumpDto(GumpResponse object) {
        this.setX(object.getX());
        this.setY(object.getY());
        this.setSerial(object.getSerial());
        this.setGumpId(object.getGumpId());
        this.setMovable(object.getMovable());
        this.setResizable(object.getResizable());
        this.setDisposable(object.getDisposable());
        this.setClosable(object.getClosable());

        this.setGroups(toDtoList(object.getGroups(),
                GroupResponse.class, GroupDto.class));

        this.setEndGroups(toDtoList(object.getEndGroups(),
                GroupResponse.class, GroupDto.class));

        this.setButtons(toDtoList(object.getButtons(),
                GumpButtonResponse.class, GumpButtonDto.class));

        this.setButtonTileArts(toDtoList(object.getButtonTileArts(),
                ButtonTileArtResponse.class, ButtonTileArtDto.class));

        this.setCheckBoxes(toDtoList(object.getCheckBoxes(),
                CheckBoxResponse.class, CheckBoxDto.class));

        this.setCheckerTrans(toDtoList(object.getCheckerTrans(),
                CheckerTransResponse.class, CheckerTransDto.class));

        this.setCroppedTexts(toDtoList(object.getCroppedTexts(),
                CroppedTextResponse.class, CroppedTextDto.class));

        this.setGumpPictures(toDtoList(object.getGumpPictures(),
                GumpPictureResponse.class, GumpPictureDto.class));

        this.setGumpTilePictures(toDtoList(object.getGumpTilePictures(),
                GumpTilePictureResponse.class, GumpTilePictureDto.class));

        this.setRadioButtons(toDtoList(object.getRadioButtons(),
                RadioButtonResponse.class, RadioButtonDto.class));

        this.setResizablePictures(toDtoList(object.getResizablePictures(),
                ResizablePictureResponse.class, ResizablePictureDto.class));

        this.setGumpTexts(toDtoList(object.getGumpTexts(),
                GumpTextResponse.class, GumpTextDto.class));

        this.setTextEntries(toDtoList(object.getTextEntries(),
                TextEntryResponse.class, TextEntryDto.class));

        this.setTexts(object.getTexts());

        this.setLimitedTextEntries(toDtoList(object.getLimitedTextEntries(),
                LimitedTextEntryResponse.class, LimitedTextEntryDto.class));

        this.setTilePictures(toDtoList(object.getTilePictures(),
                TilePictureResponse.class, TilePictureDto.class));

        this.setHuedTilePictures(toDtoList(object.getHuedTilePictures(),
                HuedTilePictureResponse.class, HuedTilePictureDto.class));

        this.setGumpTooltips(toDtoList(object.getGumpTooltips(),
                GumpTooltipResponse.class, GumpTooltipDto.class));

        this.setHtmlGumps(toDtoList(object.getHtmlGumps(),
                HtmlGumpResponse.class, HtmlGumpDto.class));

        this.setXmfHtmlGumps(toDtoList(object.getXmfHtmlGumps(),
                XmfHtmlGumpResponse.class, XmfHtmlGumpDto.class));

        this.setXmfHtmlGumpColors(toDtoList(object.getXmfHtmlGumpColors(),
                XmfHtmlGumpColorResponse.class, XmfHtmlGumpColorDto.class));

        this.setXmfHtmlTokens(toDtoList(object.getXmfHtmlTokens(),
                XmfHtmlTokenResponse.class, XmfHtmlTokenDto.class));

        this.setItemProperties(toDtoList(object.getItemProperties(),
                ItemPropertyResponse.class, ItemPropertyDto.class));

        this.setPictureInPictures(toDtoList(object.getPictureInPictures(),
                PictureInPictureResponse.class, PictureInPictureDto.class));

        this.setTilePictureAsGumpPictures(toDtoList(object.getTilePictureAsGumpPictures(),
                TilePictureAsGumpPictureResponse.class, TilePictureAsGumpPictureDto.class));

        this.setUpperWordCaseToggles(toDtoList(object.getUpperWordCaseToggles(),
                UpperWordCaseToggleResponse.class, UpperWordCaseToggleDto.class));

        this.setHuedGumpPictures(toDtoList(object.getHuedGumpPictures(),
                HuedGumpPictureResponse.class, HuedGumpPictureDto.class));
    }

    private <I, O> List<O> toDtoList(List<I> param, Class<I> inputClass, Class<O> outputClass) {
        List<O> list = new ArrayList<>();
        for (I input : param) {
            try {
                O output = outputClass.getDeclaredConstructor(inputClass).newInstance(input);
                list.add(output);
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                     NoSuchMethodException e) {
                throw new BaseException(e);
            }
        }
        return list;
    }
}
